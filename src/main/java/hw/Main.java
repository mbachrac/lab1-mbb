package hw;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.RandomWalkIterator;

public class Main {

  public static void main(String[]args)
  {
      final String GA=CountryCodes.GA;
      final String FL=CountryCodes.FL;
      final String AL=CountryCodes.AL;
      final String TN=CountryCodes.TN;
      final String NC=CountryCodes.NC;
      final String SC=CountryCodes.SC;
      final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
      myMap.addVertex(GA);
      myMap.addVertex(FL);
      myMap.addVertex(AL);
      myMap.addVertex(TN);
      myMap.addVertex(NC);
      myMap.addVertex(SC);
      myMap.addEdge(GA, FL);
      myMap.addEdge(GA, AL);
      myMap.addEdge(GA, TN);
      myMap.addEdge(GA, NC);
      myMap.addEdge(GA, SC);
      myMap.addEdge(TN, NC);
      myMap.addEdge(NC, SC);
      myMap.addEdge(FL, AL);
      myMap.addEdge(AL, TN);
      System.out.println(myMap);
      final Iterator<String> bfGA = new BreadthFirstIterator<>(myMap, GA);
      System.out.println("Breadth First starting @ GA");
      while (bfGA.hasNext()) {
          final String state = bfGA.next();
          System.out.println(state);
      }
      System.out.println();
      final Iterator<String> bfTN = new BreadthFirstIterator<>(myMap, TN);
      System.out.println("Breadth First starting @ TN");
      while (bfTN.hasNext()) {
          final String state = bfTN.next();
          System.out.println(state);
      }
      System.out.println();
      final Iterator<String> dfGA=new DepthFirstIterator<>(myMap,GA);
      System.out.println("Depth First starting @ GA");
      while(dfGA.hasNext()) {
          final String state=dfGA.next();
          System.out.println(state);
      }
      System.out.println();
      final Iterator<String> dfTN=new DepthFirstIterator<>(myMap,TN);
      System.out.println("Depth First starting @ TN");
      while(dfTN.hasNext()){
          final String state=dfTN.next();
          System.out.println(state);
      }
      System.out.println();
      final Iterator<String> rwGA=new RandomWalkIterator<>(myMap,GA);
      System.out.println("Random Walk starting @ GA");
      int i=0;
      while ((rwGA.hasNext())&&(i<10)){
          final String state=rwGA.next();
          System.out.println(state);
          i++;
      }
      System.out.println();
      final Iterator<String> rwFL=new RandomWalkIterator<>(myMap,FL);
      System.out.println("Random Walk starting @ FL");
      int j=0;
      while ((rwFL.hasNext())&&(j<10)){
          final String state=rwFL.next();
          System.out.println(state);
          j++;
      }
      System.out.println();
      final Iterator<String>cfGA=new ClosestFirstIterator<>(myMap,GA);
      System.out.println("Closest First starting @ GA");
      while (cfGA.hasNext()){
          final String state=cfGA.next();
          System.out.println(state);
      }
      System.out.println();
      final Iterator<String>cfNC=new ClosestFirstIterator<>(myMap,NC);
      System.out.println("Closest First starting @ NC");
      while (cfNC.hasNext()){
          final String state=cfNC.next();
          System.out.println(state);
      }
      System.out.println();
      GreedyColoring gc=new GreedyColoring(myMap);
     System.out.println(gc.getColoring());
  }
}