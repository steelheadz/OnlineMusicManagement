<script setup lang="ts">

</script>

<template>
  <div class="basicHeader">
    <div class="logo-area">
      <img class="logo" src="../assets/img/logo.png">
    </div>
    <div class="title-area">
      <div class="title">在线音乐后台管理系统</div>
    </div>
    <div class="avatar-area">
      <img class="avatar" src="#">
    </div>
  </div>
</template>


<style scoped lang="scss">
.basicHeader {
  background-color: black;
  display: flex;
  flex-direction: row;

  .logo-area {
    width: 20%;

    .logo {
      margin-left: 20px;
      width: 90px;
      height: 90px;
    }
  }

  .title-area {
    flex: 1;
    display: flex;
    flex-direction: column;
    justify-content: space-around;

    .title {
      color: #f2f2f2;
      font-size: 40px;
      text-align: center;

    }
  }

  .avatar-area {
    width: 20%;

    .avatar {

    }
  }
}
</style>

