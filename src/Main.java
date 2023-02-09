import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

        public class Main {

            public static void main(String[] args) {
        String[]namesArray={"John","James","Jack","Jill","Jane"};

                Set<String> namesSet = new LinkedHashSet<>(Arrays.asList(namesArray));

                Iterator<String> namesIterator=namesSet.iterator();

                while(namesIterator.hasNext()){

                    String str=namesIterator.next();

                    if(str.toLowerCase().contains("e")){

                        namesIterator.remove();

                    }

                    System.out.println(namesSet);

                }

            }

        }

