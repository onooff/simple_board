<template>
  <div>
    <b-table
      striped
      hover
      :items="items"
      :fields="fields"
      @row-clicked="rowClick"
    ></b-table>
  </div>
</template>

<script>
import data from "@/data";

let items = data.Content.sort((a, b) => {
  return b.id - a.id;
});
items = items.map((contentItem) => {
  return {
    ...contentItem,
    user_name: data.User.filter(
      (userItem) => userItem.user_id === contentItem.member_id
    )[0].name,
  };
});
export default {
  data() {
    return {
      fields: [
        {
          key: "id",
          label: "글번호",
        },
        {
          key: "title",
          label: "제목",
        },
        {
          key: "user_name",
          label: "작성자",
        },
        {
          key: "date",
          label: "작성일",
        },
        {
          key: "view_count",
          label: "조회",
        },
      ],
      items: items,
    };
  },
  methods: {
    rowClick(item) {
      this.$router.push({
        path: `/detail/${item.id}`,
      });
    },
  },
};
</script>
