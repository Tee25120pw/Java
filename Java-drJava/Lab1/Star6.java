class Star6 {
  public static void main(String[]args) {
    for(int i=0;i<5;i++) {
      for(int j=5;j>i;j--) {
        System.out.print("\t"); }
      for(int k=0;k<=i;k++) {
        System.out.print("*\t");  }
      for(int a=0;a<i;a++) {
        System.out.print("*\t");  }
      System.out.println(" "); }
    for(int z=0;z<4;z++) {
      for(int b=-1;b<=z;b++) {
        System.out.print("\t"); }
      for(int c=4;c>z;c--) {
        System.out.print("*\t");  }
      for(int d=3;d>z;d--) {
        System.out.print("*\t");  }
      System.out.println(" "); }
  }
}
