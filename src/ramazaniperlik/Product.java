package ramazaniperlik;

    public class Product{
        private int productId;
        private String productName;

        public Product(int productId, String productName) {
            this.productId = productId;
            this.productName = productName;
        }

        @Override
        public String toString(){
            return productName;
        }
    }
