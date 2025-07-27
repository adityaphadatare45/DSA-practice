public class OnetoN{
  static void func1(int i, int n){
   
  // Base condition
   if(i>n) return;
    System.out.println(i);

   // Funcstion to i till i increment to n.
   func1(i + 1, n);
   /// Backtracking approach

  }
  /// Backtracking approach
   static void func2(int i, int n){
     if(i<1) return;
    System.out.println(i);

    func2(i - 1, n);
   }

  public static void main(String[] args) {
      int n =5;
      func1(1,n);
      func2(n,n);

  }
}