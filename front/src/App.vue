<template>
     <Header />
      <div id="container">
        <div id="app">


          <div class="list-group">
            <a v-for="user in userList" v-bind:key="user.user_Id"  class="list-group-item list-group-item-action active" aria-current="true">
                <div class="d-flex w-100 justify-content-between">
                <h5 class="mb-1">{{user.user_id}}</h5>
            </div>
              <p class="mb-1">{{user.email}}</p>
              <small>{{user.user_name}}</small>
            </a>

            <a v-if="data.userList.length == 0" class="list-group-item list-group-item-action active" aria-current="true">
                등록된 회원이 없습니다.
            </a>
          </div>

        </div>
      </div>
  <Footer />
</template>

<script>
 import Header from './components/common/Header';
 import Footer from './components/common/Footer';
 import { onMounted, reactive } from 'vue';
 import axios from 'axios';

export default {
    name: 'App',
  components: {
    Header,
    Footer
  },
  setup(){
    const data = reactive({
      userList: []
    });
    //게시판 api 호출
    const getList = async () => {
      await axios.get('http://localhost:8083/selectUser')
      .then(response => {
        data.userList = response.data;
      });
    };
    onMounted(() => {
      getList();
    });
    return {
      data : data,
      getList : getList
    }
  }
}
</script>

<style>
html,body{padding:0; margin:0;}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin:0; padding:0;
}

@import 'https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css';
</style>