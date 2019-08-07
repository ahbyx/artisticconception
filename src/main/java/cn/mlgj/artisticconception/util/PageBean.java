/**
 * FileName：PageBean
 * Date:     2019/6/2222:51
 * Author:   阿豪
 */
package cn.mlgj.artisticconception.util;

public class PageBean {

        private int totalPageCount=0;
        private int pageSize=10;
        private int totalCount;
        private int currPageNo=1;

        public PageBean() {
            super();
        }
        public int getTotalPageCount() {
            return totalPageCount;
        }
        public void setTotalPageCount(int totalPageCount) {
            this.totalPageCount = totalPageCount;
        }
        public int getPageSize() {
            return pageSize;
        }
        public void setPageSize(int pageSize) {
            if(pageSize>0)	this.pageSize = pageSize;
        }
        public int getTotalCount() {
            return totalCount;
        }
        public void setTotalCount(int totalCount) {
            if(totalCount>0) {
                this.totalCount = totalCount;
                totalPageCount =this.totalCount%pageSize==0?this.totalCount/this.pageSize:(this.totalCount/this.pageSize)+1;
            }
        }
        public int getCurrPageNo() {
            if(currPageNo==0){
                return 0;
            }
            return currPageNo;
        }
        public void setCurrPageNo(int currPageNo) {
            if(currPageNo>0) this.currPageNo = currPageNo;
        }
}
