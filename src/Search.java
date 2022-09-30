import java.util.ArrayList;

public class Search {
        //count no of items present in the col
        public static void main(String args[])
        {
            // Create one collection using Array List
            ArrayList<String> items= new ArrayList<String>();
            items.add("Glue");
            items.add("blue");
            items.add("gray");
            items.add("green");
            items.add("white");
            items.add("t shirt");
            items.add("Goveen");
            items.add("Gun");
            items.add("Gamble");
            items.add("king");
            items.add("kite");
            int count=0;
            //for suppose we have thousand items in the list so capture the size i.e., no of items present in the list
            //items.size()
            for(int i=0;i<items.size();i++)
            {
                String actual=items.get(i);
                if(actual.startsWith("G"))
                {
                    count++;
                    System.out.print(actual);

                }

            }
            System.out.println(count);


        }



    }
