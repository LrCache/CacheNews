package www.bode.net.cachenews.model;

import java.util.List;

/**
 * 微信推送新闻实体类 Created by Liu on 2016-07-07.
 */
public class WxNews {
    
    private String reason;
    
    private ResultBean result;
    
    private int error_code;
    
    public String getReason() {
        return reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public ResultBean getResult() {
        return result;
    }
    
    public void setResult(ResultBean result) {
        this.result = result;
    }
    
    public int getError_code() {
        return error_code;
    }
    
    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
    
    public static class ResultBean {
        private int totalPage;
        
        private int ps;
        
        private int pno;
        
        private List<ListBean> list;
        
        public int getTotalPage() {
            return totalPage;
        }
        
        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }
        
        public int getPs() {
            return ps;
        }
        
        public void setPs(int ps) {
            this.ps = ps;
        }
        
        public int getPno() {
            return pno;
        }
        
        public void setPno(int pno) {
            this.pno = pno;
        }
        
        public List<ListBean> getList() {
            return list;
        }
        
        public void setList(List<ListBean> list) {
            this.list = list;
        }
        
        public static class ListBean {
            private String id;
            
            private String title;
            
            private String source;
            
            private String firstImg;
            
            private String mark;
            
            private String url;
            
            public String getId() {
                return id;
            }
            
            public void setId(String id) {
                this.id = id;
            }
            
            public String getTitle() {
                return title;
            }
            
            public void setTitle(String title) {
                this.title = title;
            }
            
            public String getSource() {
                return source;
            }
            
            public void setSource(String source) {
                this.source = source;
            }
            
            public String getFirstImg() {
                return firstImg;
            }
            
            public void setFirstImg(String firstImg) {
                this.firstImg = firstImg;
            }
            
            public String getMark() {
                return mark;
            }
            
            public void setMark(String mark) {
                this.mark = mark;
            }
            
            public String getUrl() {
                return url;
            }
            
            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
