package gotThatProduct;

    public class person {
        public static void main(String[] args){

        }
            private String name;
            private int age;

            public String getName () {
                return name;
            }
            public void setName (String name){
                this.name = name;
            }
            public int getAge () {
                return age;
            }
            public void setAge ( int age){
                if (age < 0) {
                    throw new IllegalArgumentException("age cannot be negative");
                }
                this.age = age;
            }
        }



