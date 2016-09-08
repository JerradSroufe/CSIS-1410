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
    class Rectangle
    {
        //================|
        //----Variables---|
        //================V

        private double width;
        private double height;

        //================A
        //----Variables---|
        //================|

        //================|
        //--Constructors--|
        //================V

        public Rectangle()
        {
            width = 1;
            height = 1;
        }

        public Rectangle (double width , double height)
        {
            this.width = width;
            this.height = height;
        }

        //================A
        //--Constructors--|
        //================|

        //================|
        //-----Getters----|
        //================V
        public double getWidth()    //the project doesn't explicitly say to make this, but it makes things a lot easier
        {   
            return width;
        }

        public double getHeight()   //the project doesn't explicitly say to make this, but it makes things a lot easier
        {   
            return height;
        }

        public double getArea()     //the project doesn't actually have you display this, but you still make it cos it says to
        {   
            return height * width;

        }

        public double getPerimiter()
        {
            return height + width * 2;
        }



        //================A
        //-----Getters----|
        //================|
    }
}
