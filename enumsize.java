enum size {
  A(28),B(30),C(32),D(36),E(38);
    private int sizes;
    private Size(int sizes){
      this.sizes = sizes;
    }
   }
   
   class Test {
    Size jeansize;
    public Test(Size jeansize) {
      this.jeansize=jeansize;
    }
    public void orderjean() {
      switch(jeansize) {
        case A:
          break;
        case B:
           break;
        case C:
          break;
        case D:
          break;  
        case E: 
          break;
      }
    }
   }
    public {
      public static void main(String[] args) {
        Test t1 = new Test(Size.A);
        t1.orderjean();
      }


    }
   //class Main {
    //public static void main(String[] args) {
     // Test t1 = new Test(Size.A);
     // t1.orderjean();
   // }
   
    
