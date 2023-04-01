import { createRouter, createWebHistory } from 'vue-router'
import LoginView from '../views/core/LoginView.vue'
import HomeView from '../views/core/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/login',
      name: 'Login',
      component: LoginView,
      meta: {
        requiresAuth: false,
      },
    },
    {
      path: '/register',
      name: 'Register',
      component: () =>
        import(
          /* webpackChunkName: "register" */ '../views/core/RegisterView.vue'
        ),
      meta: {
        requiresAuth: false,
      },
    },
    {
      path: '/',
      name: 'Home',
      component: HomeView,
      meta: {
        requiresAuth: true,
      },
    },
    {
      path: '/chats',
      name: 'Chats',
      component: () =>
        import(/* webpackChungName: "chats" */ '../views/chat/ChatView.vue'),
      meta: {
        requiresAuth: true,
      },
    },
    {
      path: '/settings',
      name: 'Settings',
      component: () =>
        import(
          /* webpackChungName: "chats" */ '../views/settings/SettingsView.vue'
        ),
      meta: {
        requiresAuth: true,
      },
    },
  ],
})

export default router
