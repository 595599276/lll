  <template>
    <el-table
      :data="tableData">
      <el-table-column
        prop="day"
        label="日期"
        width="180">
      </el-table-column>
      <el-table-column
        prop="time"
        label="时间"
        width="180">
      </el-table-column>
      <el-table-column
        prop="location"
        label="地点">
      </el-table-column>
      <el-table-column
        prop="participants"
        label="人员">
      </el-table-column>
    </el-table>
  </template>

  <script>
import axios from 'axios'
    export default {
      data() {
        return {
          tableData: []
        }
      },
      mounted(){
        axios.get("http://192.168.1.5:9000/record").then((result) => {
            this.tableData = result.data.data
        })
      }
    }
  </script>