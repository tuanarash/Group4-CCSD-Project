import axios from 'axios';

axios.defaults.withCredentials = true;

const API_BASE_URL = 'http://localhost:8082';

const SaveItemsAdmin = {
  async addTeamSave(email, password, firstName, lastName, phone, address, role, userName, dob, image) {
    const token = await localStorage.getItem('jwtToken');
    //const username = await localStorage.getItem('userName');

    // Create image URL
    const imageUrl = image ? URL.createObjectURL(image) : null;

    try {
      const formData = new FormData();
      //formData.append('author', userName);
      formData.append('email', email);
      formData.append('password', password);
      formData.append('firstName', firstName);
      formData.append('lastName', lastName);
      formData.append('phone', phone);
      formData.append('address', address);
      formData.append('role', role);
      formData.append('userName', userName);
      formData.append('dob', dob);
      formData.append('image', imageUrl);
      // if (image) {
      //   formData.append('image', image); // Assuming 'image' is the key on the server to handle file uploads
      // }

      const response = await axios.post(
        `${API_BASE_URL}/api/users`,
        formData,
        {
          headers: {
            'Content-Type': 'application/json', // Set content type to multipart/form-data for file uploads
            Authorization: `Bearer ${token}`,
          },
        }
      );

    //  if (response.status === 200) {
    //    return response.data;
    //  }
    //   throw new Error('Failed to save team member')
    // } catch (error) {
    //   console.error('Error details:', error.response?.data || error.message);
    //   throw new Error(error.response.data?.message || 'Failed to save team member')
    // }
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

  async addProductAdmin( postShortDescription, tag, title, postSlug, content, status, date, image, place) {
    const token = await localStorage.getItem('jwtToken');
    //const username = await localStorage.getItem('userName');

    // Create image URL
    const imageUrl = image ? URL.createObjectURL(image) : null;
    //formData.append('image', image);

    try {
      const formData = new FormData();
      //formData.append('author', userName);
      formData.append('postShortDescription', postShortDescription);
      formData.append('tag', tag);
      formData.append('place', place);
      formData.append('title', title);
      formData.append('postSlug', postSlug);
      formData.append('content', content);
      formData.append('status', status);
      formData.append('date', date);
      //formData.append('image', imageUrl);

       if (image) {
         formData.append('image', image); // Assuming 'image' is the key on the server to handle file uploads
       }

      const response = await axios.post(
        `${API_BASE_URL}/api/products`,
        formData,
        {
          headers: {
            //'Content-Type': 'application/json', // Set content type to multipart/form-data for file uploads
            Authorization: `Bearer ${token}`,
          },
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
  async addGalleryAdmin( place, postShortDescription, tag, title, postSlug, content, status, date, image) {
    const token = await localStorage.getItem('jwtToken');
    //const username = await localStorage.getItem('userName');

    // Create image URL
    const imageUrl = image ? URL.createObjectURL(image) : null;

    try {
      const formData = new FormData();
      //formData.append('author', userName);
      formData.append('postShortDescription', postShortDescription);
      formData.append('tag', tag);
      formData.append('place', place);
      formData.append('title', title);
      formData.append('postSlug', postSlug);
      formData.append('content', content);
      formData.append('status', status);
      formData.append('date', date);
      //formData.append('image', imageUrl);

       if (image) {
         formData.append('image', image); // Assuming 'image' is the key on the server to handle file uploads
       }

      const response = await axios.post(
        `${API_BASE_URL}/api/gallery`,
        formData,
        {
          headers: {
            //'Content-Type': 'application/json', // Set content type to multipart/form-data for file uploads
            Authorization: `Bearer ${token}`,
          },
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
  async addWebsiteImageAdmin( place, postShortDescription, tag, title, postSlug, content, status, date, image) {
    const token = await localStorage.getItem('jwtToken');
    //const username = await localStorage.getItem('userName');

    // Create image URL
    const imageUrl = image ? URL.createObjectURL(image) : null;

    try {
      const formData = new FormData();
      //formData.append('author', userName);
      formData.append('postShortDescription', postShortDescription);
      formData.append('tag', tag);
      formData.append('place', place);
      formData.append('title', title);
      formData.append('postSlug', postSlug);
      formData.append('content', content);
      formData.append('status', status);
      formData.append('date', date);
      formData.append('image', imageUrl);

      // if (image) {
      //   formData.append('image', image); // Assuming 'image' is the key on the server to handle file uploads
      // }

      const response = await axios.post(
        `${API_BASE_URL}/api/WebsiteImage`,
        formData,
        {
          headers: {
            'Content-Type': 'application/json', // Set content type to multipart/form-data for file uploads
            Authorization: `Bearer ${token}`,
          },
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
  async addWebsiteTextAdmin( postShortDescription, tag, title, postSlug, content, status, date, image, place) {
    const token = await localStorage.getItem('jwtToken');
    //const username = await localStorage.getItem('userName');

    // Create image URL
    const imageUrl = image ? URL.createObjectURL(image) : null;

    try {
      const formData = new FormData();
      //formData.append('author', userName);
      formData.append('postShortDescription', postShortDescription);
      formData.append('tag', tag);
      formData.append('place', place);
      formData.append('title', title);
      formData.append('postSlug', postSlug);
      formData.append('content', content);
      formData.append('status', status);
      formData.append('date', date);
      formData.append('image', imageUrl);

      // if (image) {
      //   formData.append('image', image); // Assuming 'image' is the key on the server to handle file uploads
      // }

      const response = await axios.post(
        `${API_BASE_URL}/api/WebsiteText`,
        formData,
        {
          headers: {
          //  'Content-Type': 'application/json', // Set content type to multipart/form-data for file uploads
            Authorization: `Bearer ${token}`,
          },
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

export default SaveItemsAdmin;
