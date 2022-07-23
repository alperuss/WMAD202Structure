package ca.ciccc.wmad202.assignment9.question2;

//T - the type of the first argument to the function
//U - the type of the second argument to the function
@FunctionalInterface
public interface ListCombiner<T,U>{

    //Combines two list to new list
    T combiner(T firstList,U secondList);
}
