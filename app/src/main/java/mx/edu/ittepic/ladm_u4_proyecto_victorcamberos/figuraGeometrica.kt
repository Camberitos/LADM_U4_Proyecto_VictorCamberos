package mx.edu.ittepic.ladm_u4_proyecto_victorcamberos

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent
import mx.edu.ittepic.ladm_u4_proyecto_victorcamberos.R

class FiguraGeometrica () {
    var x = 0f
    var y = 0f
    var tipo = 1 //1 circulo 2 rectangulo
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 5
    var incY = 5
    var img : Bitmap ?= null

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        //dando valor a ancho y alto para tratar circulo como cuadrado

        ancho = this.radio*2
        alto = ancho
    }

    constructor(x:Int, y:Int, ancho:Int, alto:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.ancho = ancho.toFloat()
        this.alto = alto.toFloat()
        tipo = 2
    }


    constructor(bitmap:Bitmap, x:Int, y:Int) : this(){
        img = bitmap
        this.x = x.toFloat()
        this.y = y.toFloat()
        tipo = 3
        ancho = img!!.width.toFloat()
        alto = img!!.height.toFloat()
    }

    fun pintar(c: Canvas, p: Paint){
        when(tipo){
            1->{
                c.drawCircle(x+radio,y+radio,radio,p)
            }
            2->{
                c.drawRect(x,y,x+ancho,y+alto,p)
            }
            3->{
                c.drawBitmap(img!!,x,y,p)
            }
        }
    }

    fun estaEnArea(event: MotionEvent):Boolean{

        if(event.x >= x && event.x<=x+ancho){
            if(event.y >= y && event.y<=y+alto){
                return true
            }
        }
        return false
    }

    fun arrastrar(event: MotionEvent){
        x = event.x - (ancho/2)
    }

    fun rebote(ancho:Int, alto1:Int, alto2:Int){
        x+= incX
        if(x<=0 || x>=ancho-50){
            incX *= -1
        }
        y+= incY
        if(y<=alto2 || y>=alto1-50){
            incY *= -1
        }
    }

    fun colision(objetoB:FiguraGeometrica):Boolean{

        //caso 1
        if (objetoB.estaEnArea(x+ancho,y+alto)){
            return true
        }
        //caso 2
        if (objetoB.estaEnArea(x,y+alto)){
            return true
        }
        //caso 3
        //if (objetoB.estaEnArea(x+ancho,y)){
        //    return true
        //}
        //caso 4
        //if (objetoB.estaEnArea(x,y)){
        //    return true
        //}
        return false
    }

    fun colision2(objetoB:FiguraGeometrica):Boolean{

        //caso 1
        if (objetoB.estaEnArea(x+ancho,y+alto)){
            return true
        }
        //caso 2
        if (objetoB.estaEnArea(x,y+alto)){
            return true
        }
        //caso 3
        if (objetoB.estaEnArea(x+ancho,y)){
            return true
        }
        //caso 4
        if (objetoB.estaEnArea(x,y)){
            return true
        }
        //caso 5
        if(objetoB.estaEnArea(x)){
            return false
        }
        //caso 6
        if(objetoB.estaEnArea(x+ancho)){
            return false
        }
        return false
    }


    fun estaEnArea(postx:Float,posty:Float):Boolean{

        if(postx >= x && postx<=x+ancho){
            if(posty >= y && posty<=y+alto){
                return true
            }
        }
        return false
    }

    fun estaEnArea(postx:Float):Boolean{

        if(postx >= x && postx<=x+ancho){
                return true
        }
        return false
    }


}