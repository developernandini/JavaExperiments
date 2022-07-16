class bankingdetails{
  int total=1000;
  void withdrawn(String name,int withdrawl)
  {
    if(total>=withdrawl){
      System.out.println(name+"withdrawn"+withdrawl);
      total=total-withdrawl;
      System.out.println("Balance after withdrawal:"+total);
      else{
        System.out.println(name+"you can not withdraw"+withdrawl);
        System.out.println("your balance is:"+total);
      }

    }
  }
}
void deposit(String name,int deposit){
  System.out.println(name+"deposited"+deposit);
  total=total+deposit;
System.out.println("Balance after deposit:"+total);

  void transferr(String name,int transfer){
    System.out.println(name+"transfer"+transfer);
    total=total+transfer;
  System.out.println("Balance after transfer:"+total);
  
  
  {
   obj=new int();
    obj.withdrawn("Aman",30);
    obj.withdrawn("sham",80);
    obj.deposit("ram",40);
    obj.withdrawn("shaina",60);
    obj.withdrawn("nita",50);

  }
}