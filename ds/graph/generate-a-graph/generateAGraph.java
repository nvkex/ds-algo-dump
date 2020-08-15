import java.util.*;

class GenerateGraph{
    public static void main(String []args){
        GenerateGraph obj = new GenerateGraph();
        ArrayList <ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(5);

        for(int i=1;i<=5;i++)
            list.add(new ArrayList<Integer>());

        obj.addEdge(list, 0, 1); 
        obj.addEdge(list, 0, 4); 
        obj.addEdge(list, 1, 2); 
        obj.addEdge(list, 1, 3); 
        obj.addEdge(list, 1, 4); 
        obj.addEdge(list, 2, 3); 
        obj.addEdge(list, 3, 4); 

        obj.display(list);
    }

    void addEdge(ArrayList<ArrayList<Integer>> list, int x, int y){
        list.get(x).add(y);
        list.get(y).add(x);
    }   

    void display(ArrayList<ArrayList<Integer>> list){
        for(int i=0;i<list.size(); i++){
            System.out.println("Vertex: "+i);
            System.out.print("Head");
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(" --> "+list.get(i).get(j));
            }
            System.out.println();
        }
    }   
}