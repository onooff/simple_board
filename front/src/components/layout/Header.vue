<template>
  <b-navbar toggleable type="dark" variant="dark">
    <b-navbar-brand href="/">Simple_Board</b-navbar-brand>

    <b-dropdown size="lg" text="User" class="m-2" right>
      <b-dropdown-item-button>로그인</b-dropdown-item-button>
      <b-dropdown-item-button>로그아웃</b-dropdown-item-button>
      <b-dropdown-item-button>글쓰기</b-dropdown-item-button>
    </b-dropdown>
  </b-navbar>
</template>
<script>
export default {
  name: "L_Header",
};
</script>

<style></style>
