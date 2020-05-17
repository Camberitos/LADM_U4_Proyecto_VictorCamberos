package mx.edu.ittepic.ladm_u4_proyecto_victorcamberos

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.View
import mx.edu.ittepic.ladm_u4_proyecto_victorcamberos.MainActivity
import mx.edu.ittepic.ladm_u4_proyecto_victorcamberos.R

class Lienzo(p:MainActivity) : View(p) {
    // se requiere p para que view sepa cual activity va a trabajar
    var puntero = p
    var rebotar = 2100
    var destruir = 0
    var puntosUno = 0
    var puntosDos = 0
    var turno = 0
    /*var cx = 150f
    var cy = 150f
    var tx = 733f
    var ty = 818f*/

    var marcador = Paint()

    var circulo = FiguraGeometrica(200, 700, 30)
    //var rectangulo = FiguraGeometrica(400, 2000, 200, 50)
    var obstaculo1 = FiguraGeometrica(60, 20, 150, 100)
    var obstaculo2 = FiguraGeometrica(260, 20, 150, 100)
    var obstaculo3 = FiguraGeometrica(460, 20, 150, 100)
    var obstaculo4 = FiguraGeometrica(660, 20, 150, 100)
    var obstaculo5 = FiguraGeometrica(860, 20, 150, 100)
    var obstaculo6 = FiguraGeometrica(60, 170, 150, 100)
    var obstaculo7 = FiguraGeometrica(260, 170, 150, 100)
    var obstaculo8 = FiguraGeometrica(460, 170, 150, 100)
    var obstaculo9 = FiguraGeometrica(660, 170, 150, 100)
    var obstaculo10 = FiguraGeometrica(860, 170, 150, 100)
    var obstaculo11 = FiguraGeometrica(60, 320, 150, 100)
    var obstaculo12 = FiguraGeometrica(260, 320, 150, 100)
    var obstaculo13 = FiguraGeometrica(460, 320, 150, 100)
    var obstaculo14 = FiguraGeometrica(660, 320, 150, 100)
    var obstaculo15 = FiguraGeometrica(860, 320, 150, 100)
    var obstaculo16 = FiguraGeometrica(60, 470, 150, 100)
    var obstaculo17 = FiguraGeometrica(260, 470, 150, 100)
    var obstaculo18 = FiguraGeometrica(460, 470, 150, 100)
    var obstaculo19= FiguraGeometrica(660, 470, 150, 100)
    var obstaculo20 = FiguraGeometrica(860, 470, 150, 100)
    var punteroFiguraGeometrica: FiguraGeometrica? = null
    var rectangulo = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.barra),400,2000)
    var rectangulo2 = FiguraGeometrica(BitmapFactory.decodeResource(resources, R.drawable.barra2),800,2000)
    //var sonido1 = MediaPlayer.create(puntero,R.raw.chelsea/*sonido*/)//puntero indica en cuál activity va a sonar

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.BLACK)
        //Dibujando marcador 1
        paint.color = Color.GRAY
        paint.textSize = 400f
        paint.style = Paint.Style.STROKE
        paint.color = Color.MAGENTA
        paint.strokeWidth = 3f
        canvas.drawText(puntosUno.toString(),180f,1300f,paint)

        //Dibujando marcador 2
        paint.color = Color.MAGENTA
        paint.textSize = 400f
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        paint.strokeWidth = 3f
        canvas.drawText(puntosDos.toString(),640f,1300f,paint)


        //Dibujando un círculo rojo con contorno blanco
        paint.style = Paint.Style.FILL
        paint.color = Color.CYAN
        circulo.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 3f
        circulo.pintar(canvas, paint)

        //Dibujando el rectangulo
        paint.style = Paint.Style.FILL
        paint.color = Color.YELLOW
        rectangulo.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        rectangulo.pintar(canvas, paint)

//------------------ ROJO --------------------------//

        //Dibujando obstaculo1
        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        obstaculo1.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo1.pintar(canvas, paint)

        //Dibujando obstaculo2
        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        obstaculo2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo2.pintar(canvas, paint)

        //Dibujando obstaculo3
        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        obstaculo3.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo3.pintar(canvas, paint)

        //Dibujando obstaculo4
        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        obstaculo4.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo4.pintar(canvas, paint)

        //Dibujando obstaculo5
        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        obstaculo5.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo5.pintar(canvas, paint)

//------------------ BLANCO --------------------------//

        //Dibujando obstaculo1
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        obstaculo6.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo6.pintar(canvas, paint)

        //Dibujando obstaculo2
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        obstaculo7.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo7.pintar(canvas, paint)

        //Dibujando obstaculo3
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        obstaculo8.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo8.pintar(canvas, paint)

        //Dibujando obstaculo4
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        obstaculo9.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo9.pintar(canvas, paint)

        //Dibujando obstaculo5
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        obstaculo10.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo10.pintar(canvas, paint)

//------------------ VERDE --------------------------//

        //Dibujando obstaculo1
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        obstaculo11.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo11.pintar(canvas, paint)

        //Dibujando obstaculo2
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        obstaculo12.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo12.pintar(canvas, paint)

        //Dibujando obstaculo3
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        obstaculo13.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo13.pintar(canvas, paint)

        //Dibujando obstaculo4
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        obstaculo14.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo14.pintar(canvas, paint)

        //Dibujando obstaculo5
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        obstaculo15.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo15.pintar(canvas, paint)

//------------------ BLUE --------------------------//

        //Dibujando obstaculo1
        paint.style = Paint.Style.FILL
        paint.color = Color.BLUE
        obstaculo16.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo16.pintar(canvas, paint)

        //Dibujando obstaculo2
        paint.style = Paint.Style.FILL
        paint.color = Color.BLUE
        obstaculo17.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo17.pintar(canvas, paint)

        //Dibujando obstaculo3
        paint.style = Paint.Style.FILL
        paint.color = Color.BLUE
        obstaculo18.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo18.pintar(canvas, paint)

        //Dibujando obstaculo4
        paint.style = Paint.Style.FILL
        paint.color = Color.BLUE
        obstaculo19.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo19.pintar(canvas, paint)

        //Dibujando obstaculo5
        paint.style = Paint.Style.FILL
        paint.color = Color.BLUE
        obstaculo20.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        obstaculo20.pintar(canvas, paint)

        rectangulo.pintar(canvas,paint)
        rectangulo2.pintar(canvas,paint)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        puntero.setTitle("")
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                //REVISAMOS QUIEN ESTA EN AREA
                if (rectangulo.estaEnArea(event)) {
                    punteroFiguraGeometrica = rectangulo
                }
                if (rectangulo2.estaEnArea(event)) {
                    punteroFiguraGeometrica = rectangulo2
                }
                /*//if (icono.estaEnArea(event)) {
                //    punteroFiguraGeometrica = icono
                //    puntero.setTitle("TOCASTE TRIÁNGULO")
                //    sonido1.start()
                //}*/
            }


            MotionEvent.ACTION_MOVE -> {
                if (punteroFiguraGeometrica != null) {
                    punteroFiguraGeometrica!!.arrastrar(event)
                }

            }
            MotionEvent.ACTION_UP -> {
                punteroFiguraGeometrica = null
            }
        }
        invalidate()
        return true
    }

    fun animarCirculo() {
        // circulo2.rebote(width, height)
        rebotaPelota()
        circulo.rebote(width,rebotar,destruir)
        invalidate()

    }

    fun rebotaPelota(){
        if(circulo.colision(rectangulo)){
            rebotar = (rectangulo.y+rectangulo.alto-85).toInt()
            turno = 1
        }else if(circulo.colision(rectangulo2)) {
            rebotar = (rectangulo2.y + rectangulo2.alto - 85).toInt()
            turno = 2
        }else if(circulo.colision2(obstaculo1)){
            destruir = (obstaculo1.y+obstaculo1.alto+40).toInt()
            obstaculo1 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo2)){
            destruir = (obstaculo2.y+obstaculo2.alto+40).toInt()
            obstaculo2 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo3)){
            destruir = (obstaculo3.y+obstaculo3.alto+40).toInt()
            obstaculo3 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo4)){
            destruir = (obstaculo4.y+obstaculo4.alto+40).toInt()
            obstaculo4 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo5)){
            destruir = (obstaculo5.y+obstaculo5.alto+40).toInt()
            obstaculo5 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo6)){
            destruir = (obstaculo6.y+obstaculo6.alto+40).toInt()
            obstaculo6 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo7)){
            destruir = (obstaculo7.y+obstaculo7.alto+40).toInt()
            obstaculo7 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo8)){
            destruir = (obstaculo8.y+obstaculo8.alto+40).toInt()
            obstaculo8 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo9)){
            destruir = (obstaculo9.y+obstaculo9.alto+40).toInt()
            obstaculo9 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo10)){
            destruir = (obstaculo10.y+obstaculo10.alto+40).toInt()
            obstaculo10 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo11)){
            destruir = (obstaculo11.y+obstaculo11.alto+40).toInt()
            obstaculo11 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo12)){
            destruir = (obstaculo12.y+obstaculo12.alto+40).toInt()
            obstaculo12 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo13)){
            destruir = (obstaculo13.y+obstaculo13.alto+40).toInt()
            obstaculo13 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo14)){
            destruir = (obstaculo14.y+obstaculo14.alto+40).toInt()
            obstaculo14 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo15)){
            destruir = (obstaculo15.y+obstaculo15.alto+40).toInt()
            obstaculo15 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo16)){
            destruir = (obstaculo16.y+obstaculo16.alto+40).toInt()
            obstaculo16 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo17)){
            destruir = (obstaculo17.y+obstaculo17.alto+40).toInt()
            obstaculo17 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo18)){
            destruir = (obstaculo18.y+obstaculo18.alto+40).toInt()
            obstaculo18 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo19)){
            destruir = (obstaculo19.y+obstaculo19.alto+40).toInt()
            obstaculo19 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else if(circulo.colision2(obstaculo20)){
            destruir = (obstaculo20.y+obstaculo20.alto+40).toInt()
            obstaculo20 = FiguraGeometrica(1,1,-20,-20)
            if(turno == 1) {
                puntosUno += 1
            }else if(turno == 2){
                puntosDos += 1
            }
        }else{
            rebotar = 2300  //if rebotar = 2300, juego terminado
            destruir = 0
        }
    }

}