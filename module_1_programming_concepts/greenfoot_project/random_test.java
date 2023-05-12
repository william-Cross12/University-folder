//package module_1_programming_concepts.task_2;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class random_test {
    public static void main(String[] args)
    {
        boolean x = true;
        while (x==true)
        {
            List<Integer> ex_list = new ArrayList<Integer>();
            Integer[] ex = null;
            // ex must have different numbers
            Random rnd = new Random();
            int spawn_breaker = random_test.getRandomWithExclusion(rnd, 1, 12, ex);
            
            ex_list.add(spawn_breaker);
            ex = ex_list.toArray(new Integer[ex_list.size()]);
            int spawn_time = random_test.getRandomWithExclusion(rnd, 1, 12, ex);


        }
    }

    public static int getRandomWithExclusion(Random rnd, int start, int end, Integer[] exclude) 
    {
        if (exclude == null)
        {
            int random = 0;
            while (true)
            {
                random = rnd.nextInt(13);
                if(random !=0) break;
            }
            return random;
        }
        else
        {
            int random = start + rnd.nextInt(end - start + 1 - exclude.length);
            for (int ex : exclude) {
                if (random < ex) {
                    break;
                }
                random++;
            }
            return random;
        }
    }
}



    