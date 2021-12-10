package Mathes;

public class MathHW
{
    public int CarDistance(int SpeedOneCar, int SpeedTwoCar, int Distance, int Time) {
        //расстояние между автомобилями, которые двигаются на разной скорости
        if (SpeedOneCar<0|| SpeedTwoCar<0|| Distance<0||Time<0){
         System.out.println("Значение не может быть меньше нуля, введите данные повторно");

            return 0;
        }


        int result = ((SpeedOneCar+SpeedTwoCar) * Time)+Distance;
      return result;
    }
    
//Записать логическое выражение, принимающее значение 2, если точка лежит внутри заштрихованной области, иначе - 0

}
