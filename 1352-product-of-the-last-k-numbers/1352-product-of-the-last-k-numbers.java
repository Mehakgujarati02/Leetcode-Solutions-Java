class ProductOfNumbers {
    List<Integer> a = new ArrayList<>();

    public ProductOfNumbers() {
       
    }
    
    public void add(int num) {
        a.add(num);
    }
    
    public int getProduct(int k) {
        int n = a.size(); 
        int prod = 1;
        for (int i = n - k; i < n; i++)
            prod *= a.get(i);
        return prod;
    }
}//this is the brute force approach, //tc:- O(k), sc:- O(n)

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */