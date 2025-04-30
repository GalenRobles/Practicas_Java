using System;

namespace ProgramaSenoK
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingresa el angulo en grados:");
            double angrd = double.Parse(Console.ReadLine());
            double x = angrd * Math.PI / 180;

            Console.WriteLine("Dame la cantidad de terminos:");
            int m = int.Parse(Console.ReadLine());

            double sen = 0, numer = 0, fac = 1;

            for (int i = 0; i < m; i++)
            {
                numer = Math.Pow(-1, i) * Math.Pow(x, 2 * i + 1);
                int deno = 2 * i + 1;
                fac = 1;

                for (int j = 1; j <= deno; j++)
                {
                    fac *= j;
                }

                sen += numer / fac;
            }

            Console.WriteLine($"el seno es de {sen}");
           

            Console.ReadKey();
        }
    }
}
