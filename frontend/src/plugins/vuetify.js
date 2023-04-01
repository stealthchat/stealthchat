// Styles
import '@mdi/font/css/materialdesignicons.css'
import 'vuetify/styles'

// Vuetify
import { createVuetify } from 'vuetify'

const darkTheme = {
  dark: true,
  colors: {
    background: '#121212',
    surface: '#212121',
    primary: '#6A1B9A',
    secondary: '#3F51B5',
    error: '#C2185B',
    info: '#296F3',
    success: '#00897B',
    warning: '#EC407A',
  },
}

export default createVuetify({
  theme: {
    options: { customProperties: true },
    themes: {
      dark: darkTheme,
    },
    defaultTheme: 'dark',
  },
})
// https://vuetifyjs.com/en/introduction/why-vuetify/#feature-guides
