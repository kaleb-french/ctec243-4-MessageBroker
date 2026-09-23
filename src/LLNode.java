    public class LLNode<T>{
        private T info;
        private LLNode<T> link;
        LLNode(T item){
            this.info = item;
            this.link = null;
        }
        public T getInfo(){
            return info;
        }
        public void setLink(LLNode<T> link){
            this.link = link;
        }
        public LLNode<T> getLink(){
            return this.link;
        }
    }
