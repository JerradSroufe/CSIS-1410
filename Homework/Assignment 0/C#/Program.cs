/*Jerrad Sroufe
 *CSIS 1410
 *Homework 0
 *8/27/16
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HW0
{
    class Program
    {
        public static void Main(String[] args)
        {
            Rectangle rectangle1 = new Rectangle(4, 40);
            Rectangle rectangle2 = new Rectangle(3.5, 35.9);
            
            describe(rectangle1);
            describe(rectangle2);
        }

        public static void describe(Rectangle rectangle)
        {
            String description = "";
            description += "Width: " + rectangle.getWidth() + "\n";
            description += "Height: " + rectangle.getHeight() + "\n";
            description += "Perimiter: " + rectangle.getPerimiter() + "\n";
            Console.WriteLine(description);
        }
    }
}
