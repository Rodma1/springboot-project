<template>
  <el-table :data="tableData" style="width: 100%">
    <el-table-column prop="id" label="id" width="180">
    </el-table-column>
    <el-table-column prop="content" label="内容" width="180">
    </el-table-column>
    <el-table-column prop="title" label="标题">
    </el-table-column>
    <el-table-column prop="createTime" label="创建时间">
    </el-table-column>
  </el-table>
</template>

<script>
export default {

  created() {
    const _this = this
    this.axios
    .get('http://127.0.0.1:8080/task/taskList')
     .then(function (response) {
      _this.tableData = response.data.data
      console.log(response.data)
     });
  },
  data() {
    return {
      tableData: [{
        id: null,
        createTime: '',
        updateTime: '',
        content: '',
        title: '',
      }]
    }
  }
}
</script>
