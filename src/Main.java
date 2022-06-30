public class Main
{
    public static void main(String[] args)
    {
        int height = 11, starAmount = 1, i = 1;

        int midline = height / 2 + 1;

        while (i <= midline)
        {

            for (int j = midline; j > i ; j--)
            {
                System.out.print("   ");
            }

            for (int a = 0; a < starAmount; a++)
            {
                System.out.print("*  ");
            }
            starAmount += 2;

            System.out.println();
            i++;
        }


        while (i <= height)
        {

            for (int j = midline; j < i; j++)
            {
                System.out.print("   ");
            }

            for (int a = 4; a < starAmount; a++)
            {
                System.out.print("*  ");
            }
            starAmount -= 2;

            System.out.println();
            i++;
        }


        System.out.println();
        System.out.println();


            for (int w = 0; w < height; w++)
            {
                System.out.println();

                for (int j = 0; j < height; j++)
                {
                    System.out.print("*  ");
                }
            }
    }
}
