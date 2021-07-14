class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> lst=new ArrayList<List<Integer>>();
        backtrack(graph,lst,new ArrayList<Integer>(),0);
        return lst;
    }
    public void backtrack(int[][] graph,List<List<Integer>> lst,List<Integer> arr,int start) {
        if (arr.size()>0 && arr.get(arr.size()-1)==graph.length-1) {
            arr.add(0,0);
            lst.add(new ArrayList<Integer>(arr));
            arr.remove(0);
            return;
        }
        for (int end=0;end<graph[start].length;end++) {
            arr.add(graph[start][end]);
            backtrack(graph,lst,arr,graph[start][end]);
            arr.remove(arr.size()-1);
        }
    }
}
