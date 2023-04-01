import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import { createPinia } from 'pinia'
import vuetify from './plugins/vuetify'
//import socket from 'socket.io-client'
import { loadFonts } from './plugins/webfontloader'

loadFonts()

const Vue = createApp(App)
const pinia = createPinia()
/*const io = socket('localhost:8080/chat')

Vue.config.globalProperties.$io = io*/

Vue.use(router)
Vue.use(pinia)
Vue.use(vuetify)
Vue.mount('#app')
