<template>
  <ChatNavigation />
  <ChatComponent />
</template>
<script>
import ChatNavigation from '../../components/chat/ChatNavigation.vue'
import ChatComponent from '../../components/chat/ChatComponent.vue'

export default {
  name: 'HomeView',
  data: () => ({}),
  components: {
    ChatNavigation,
    ChatComponent,
  },
  created: () => {},
}
</script>
