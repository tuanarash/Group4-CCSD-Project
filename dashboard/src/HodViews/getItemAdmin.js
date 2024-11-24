import axios from 'axios';

axios.defaults.withCredentials = true;

const API_BASE_URL = 'http://localhost:8082';

const GetItemsAdmin = {
  async getTeamDataAdmin() {
    const token = await localStorage.getItem('jwtToken');
    const username = await localStorage.getItem('userName');

    //const imageUrl = image ? URL.createObjectURL(image) : null;

    try {
      const response = await axios.get(
        `${API_BASE_URL}/api/users`,

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
      
      

    //  throw new Error('Failed to save team member')
    } catch (error) {
      console.error('Error details:', error.response?.data || error.message);
      throw new Error(error.response.data?.message || 'Failed to save team member')
    }        
    /*  if (response.status === 200) {
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
    }*/
    
  },

  async getTeamDataAdminEdit(id) {                  //change here user_id to id
    const token = await localStorage.getItem('jwtToken');

    
    try {
      const response = await axios.get(
        `${API_BASE_URL}/api/users/${id}`, //change here user_id to id

        {
          // request headers
          headers: {
            'Content-Type': 'application/json',
            Authorization: `Bearer ${token}`,
          }
        }
      );
  
      if (response.status === 200 && response.status < 300) {
        return response.data;
      }
      throw new Error('Failed to get data team member')
    } catch (error) {
      console.error('Error details:', error.response?.data || error.message);
      throw new Error(error.response.data?.message || 'Failed to get data team member')
    }
    
  },

  async getClientDataAdmin() {
    const token = await localStorage.getItem('jwtToken');
    const username = await localStorage.getItem('userName');

    try {
      const response = await axios.get(
        `${API_BASE_URL}/api/users`,
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

  async getTeamDataAdminEdit(id) {               //change here user_id to id
    const token = await localStorage.getItem('jwtToken');

    
    try {
      const response = await axios.get(
        `${API_BASE_URL}/api/users/${id}`,      //change here user_id to id

        {
          // request headers
          headers: {
            'Content-Type': 'application/json',
            Authorization: `Bearer ${token}`,
          }
        }
      );
  
      console.log(response.data.first_name)      //change first_name to firstName
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
    
  }


};



export default GetItemsAdmin;
