import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by vikash on 4/10/17.
 */
public class ObjectDotJoining {


    void test(){

        List<Game> list = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5)
        );

        //{Dragon Blaze, Angry Bird, Candy Crush}
        String result = list.stream().map(x -> x.getName())
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(result);

    }

    class Game{
        String name;
        int ranking;

        public Game(String name, int ranking) {
            this.name = name;
            this.ranking = ranking;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRanking() {
            return ranking;
        }

        public void setRanking(int ranking) {
            this.ranking = ranking;
        }
    }

    public static void main(String[] args) {
        ObjectDotJoining oj=new ObjectDotJoining();
        oj.test();
    }
}
