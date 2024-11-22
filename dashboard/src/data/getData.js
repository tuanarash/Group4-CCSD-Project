import axios from 'axios';

axios.defaults.withCredentials = true;

const API_BASE_URL = 'http://localhost:8082';

const GetData = {
  async getPrucuts() {
    const token = await localStorage.getItem('jwtToken');
    const username = await localStorage.getItem('userName');

    try {
      const response = await axios.get(
        `${API_BASE_URL}/view_teams_admin/`,

        {
          // request headers
          headers: {
            'Content-Type': 'application/json',
            Authorization: `Bearer ${token}`,
          }
        }
      );
      
            
      if (response.status === 200) {
        return response.data;
      }
    } catch (error) {
      if (error.response) {
        console.error('Server responded with an error:', error.response.data);
      } else if (error.request) {
        console.error('No response received:', error.request);
      } else {
        console.error('Error setting up the request:', error.message);
      }
      throw error;
    }
    
  },

  async getWebsiteTexts() {
    const token = await localStorage.getItem('jwtToken');

    
    try {
      const response = await axios.get(
        `${API_BASE_URL}/view_teams_admin_edit`,

        {
          // request headers
          headers: {
            'Content-Type': 'application/json',
            Authorization: `Bearer ${token}`,
          }
        }
      );
  
 
      if (response.status === 200) {
        return response.data;
      }
    } catch (error) {
      if (error.response) {
        console.error('Server responded with an error:', error.response.data);
      } else if (error.request) {
        console.error('No response received:', error.request);
      } else {
        console.error('Error setting up the request:', error.message);
      }
      throw error;
    }
    
  },

  async getWebsiteImages() {
    const token = await localStorage.getItem('jwtToken');
    const username = await localStorage.getItem('userName');

    try {
      const response = await axios.get(
        `${API_BASE_URL}/view_clients_admin`,
        {
          // request headers
          headers: {
            'Content-Type': 'application/json',
            Authorization: `Bearer ${token}`,
          }
        }
      );
      
            
      if (response.status === 200) {
        return response.data;
      }
    } catch (error) {
      if (error.response) {
        console.error('Server responded with an error:', error.response.data);
      } else if (error.request) {
        console.error('No response received:', error.request);
      } else {
        console.error('Error setting up the request:', error.message);
      }
      throw error;
    }
    
  },

    async getWebsiteGallery() {
    const token = await localStorage.getItem('jwtToken');

    
    try {
      const response = await axios.get(
        `${API_BASE_URL}/view_teams_admin_edit`,

        {
          // request headers
          headers: {
            'Content-Type': 'application/json',
            Authorization: `Bearer ${token}`,
          }
        }
      );
  
 
      if (response.status === 200) {
        return response.data;
      }
    } catch (error) {
      if (error.response) {
        console.error('Server responded with an error:', error.response.data);
      } else if (error.request) {
        console.error('No response received:', error.request);
      } else {
        console.error('Error setting up the request:', error.message);
      }
      throw error;
    }
    
  },

  async getWebsiteTestemonies() {
    const token = await localStorage.getItem('jwtToken');

    
    try {
      const response = await axios.get(
        `${API_BASE_URL}/view_teams_admin_edit`,

        {
          // request headers
          headers: {
            'Content-Type': 'application/json',
            Authorization: `Bearer ${token}`,
          }
        }
      );
 
      if (response.status === 200) {
        return response.data;
      }
    } catch (error) {
      if (error.response) {
        console.error('Server responded with an error:', error.response.data);
      } else if (error.request) {
        console.error('No response received:', error.request);
      } else {
        console.error('Error setting up the request:', error.message);
      }
      throw error;
    }
    
  },

  async getWebsiteTeams() {
    const token = await localStorage.getItem('jwtToken');

    
    try {
      const response = await axios.get(
        `${API_BASE_URL}/view_teams_admin_edit`,

        {
          // request headers
          headers: {
            'Content-Type': 'application/json',
            Authorization: `Bearer ${token}`,
          }
        }
      );
  
     
      if (response.status === 200) {
        return response.data;
      }
    } catch (error) {
      if (error.response) {
        console.error('Server responded with an error:', error.response.data);
      } else if (error.request) {
        console.error('No response received:', error.request);
      } else {
        console.error('Error setting up the request:', error.message);
      }
      throw error;
    }
    
  },

  async getProduct(slug) {
    const token = await localStorage.getItem('jwtToken');

    try {
        const response = await axios.get(
            `${API_BASE_URL}/product/${slug}`,
            {
                // request headers
                headers: {
                    'Content-Type': 'application/json',
                    Authorization: `Bearer ${token}`,
                }
            }
        );

        if (response.status === 200) {
            return response.data;
        }
    } catch (error) {
        if (error.response) {
            console.error('Server responded with an error:', error.response.data);
        } else if (error.request) {
            console.error('No response received:', error.request);
        } else {
            console.error('Error setting up the request:', error.message);
        }
        throw error;
    }
},


};



export default GetData;
