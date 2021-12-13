package com.example.semesterproject.screens.mainBoard

import android.graphics.Color.red
import android.opengl.ETC1.getWidth
import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text


// Will use selectedCord to draw circle
@Composable
fun drawO() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(
            color = Color.Black,
            center = Offset(315f, 481f),
            radius = 30f,
            style = Stroke(width = size.width * 0.008f)
        )
    }
}


// Will use selectedCord to draw 2 lines from
@Composable
fun drawX() {
    Canvas(modifier = Modifier.fillMaxSize()) {

        // If the reference point is TOP:[1,1] (190,381) finalcordList(1)
        // then the first line is the reference point modified by
        // start: x+30f, y+30f
        // end: x-30f, y-30f
        drawLine(
            color = Color.Black,
            start = Offset(x = 345f, y = 511f),
            end = Offset(x = 285f, y = 451f),
            strokeWidth = 10F
        )

        //If the reference point is TOP:[1,1] (190,381)
        // then the second line is the reference point modified by
        // Start: x+30, y-30
        // End: x+30, y+30
        drawLine(
            color = Color.Black,
            start = Offset(x =345f , y = 451f),
            end = Offset(x = 285f, y = 511f),
            strokeWidth = 10F
        )
    }
}


@Composable
fun draw3dGrid() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        val canvasSize = size

        Log.d("canvas Width =  ", canvasWidth.toString())
        Log.d("canvas height = ", canvasHeight.toString())

        // Middle Grid
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 150F, y = canvasHeight - 600F),
            end = Offset(x = canvasWidth - 500f, y = canvasHeight - 900F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 325F, y = canvasHeight - 600F),
            end = Offset(x = canvasWidth - 675f, y = canvasHeight - 900F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 500F, y = canvasHeight - 600F),
            end = Offset(x = canvasWidth - 850f, y = canvasHeight - 900F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 675F, y = canvasHeight - 600F),
            end = Offset(x = canvasWidth - 1025f, y = canvasHeight - 900F),
            strokeWidth = 10F
        )

        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 150f, y = canvasHeight - 600F),
            end = Offset(x = canvasWidth - 675f, y = canvasHeight - 600F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 500, y = canvasHeight - 900F),
            end = Offset(x = canvasWidth - 1025f, y = canvasHeight - 900F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 280f, y = canvasHeight - 710F),
            end = Offset(x = canvasWidth - 795f, y = canvasHeight - 710F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 375f, y = canvasHeight - 790F),
            end = Offset(x = canvasWidth - 890f, y = canvasHeight - 790F),
            strokeWidth = 10F
        )
        // Bottom Grid
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 150F, y = canvasHeight - 100F),
            end = Offset(x = canvasWidth - 500f, y = canvasHeight - 400F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 325F, y = canvasHeight - 100F),
            end = Offset(x = canvasWidth - 675f, y = canvasHeight - 400F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 500F, y = canvasHeight - 100F),
            end = Offset(x = canvasWidth - 850f, y = canvasHeight - 400F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 675F, y = canvasHeight - 100F),
            end = Offset(x = canvasWidth - 1025f, y = canvasHeight - 400F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 150f, y = canvasHeight - 100F),
            end = Offset(x = canvasWidth - 675f, y = canvasHeight - 100F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 500, y = canvasHeight - 400F),
            end = Offset(x = canvasWidth - 1025f, y = canvasHeight - 400F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 375f, y = canvasHeight - 290F),
            end = Offset(x = canvasWidth - 890f, y = canvasHeight - 290F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 280f, y = canvasHeight - 210F),
            end = Offset(x = canvasWidth - 795f, y = canvasHeight - 210F),
            strokeWidth = 10F
        )
        // Top Grid
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 150F, y = canvasHeight - 1100F),
            end = Offset(x = canvasWidth - 500f, y = canvasHeight - 1400F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 325F, y = canvasHeight - 1100F),
            end = Offset(x = canvasWidth - 675f, y = canvasHeight - 1400F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 500F, y = canvasHeight - 1100F),
            end = Offset(x = canvasWidth - 850f, y = canvasHeight - 1400F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 675F, y = canvasHeight - 1100F),
            end = Offset(x = canvasWidth - 1025f, y = canvasHeight - 1400F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 150f, y = canvasHeight - 1100F),
            end = Offset(x = canvasWidth - 675f, y = canvasHeight - 1100F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 500, y = canvasHeight - 1400F),
            end = Offset(x = canvasWidth - 1025f, y = canvasHeight - 1400F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 280f, y = canvasHeight - 1210F),
            end = Offset(x = canvasWidth - 795f, y = canvasHeight - 1210F),
            strokeWidth = 10F
        )
        drawLine(
            color = Color.Black,
            start = Offset(x = canvasWidth - 375f, y = canvasHeight - 1290F),
            end = Offset(x = canvasWidth - 890f, y = canvasHeight - 1290F),
            strokeWidth = 10F
        )

        // Creates grid reference points for the center of each grid square
        // Each dot is drawn in order from left to right starting from the Top grid -> middle grid -> bottom grid and stored as a list
        var currentX = (canvasWidth - 890f)
        var currentY = (canvasHeight - 1350f)

        // Top Grid
        drawCircle(
            color = Color.Black,
            center = Offset(x = currentX, y = currentY),
            radius = 10f
        )

        var cordpair = CordPair(0f,0f)
        var cordList = listOf(cordpair)

        cordpair.xcord = currentX
        cordpair.ycord = currentY
        cordList = cordList + listOf(CordPair(cordpair.xcord, cordpair.ycord))

        Log.d("Tag", cordList.toString())
        Log.d("# elements in cordpair", cordList.size.toString())

        for (i in 1..8) {

            Log.d(" TOP  x-Value ", "$currentX")
            Log.d(" TOP  y-Value ", "$currentY")

            if (i % 3 == 0) {
                currentX -= 225f
                currentY += 100f
            }

            else {
                currentX += 175f
            }
            drawCircle(
                color = Color.Black,
                center = Offset(x = currentX, y = currentY),
                radius = 10f
            )
            cordpair.xcord = currentX
            cordpair.ycord = currentY
            cordList = cordList + listOf(CordPair(cordpair.xcord,cordpair.ycord))
        }

        // Middle Grid
        currentX = (canvasWidth - 890f)
        currentY = (canvasHeight - 850f)

        drawCircle(
            color = Color.Black,
            center = Offset(x = currentX, y = currentY),
            radius = 10f
        )

        cordpair.xcord = currentX
        cordpair.ycord = currentY
        cordList = cordList + listOf(CordPair(cordpair.xcord,cordpair.ycord))

        for (i in 1..8) {
            Log.d(" MIDDLE   x-Value ", "$currentX")
            Log.d(" MIDDLE   y-Value ", "$currentY")
            if (i % 3 == 0) {
                currentX -= 225f
                currentY += 100f
            } else {
                currentX += 175f
            }
            drawCircle(
                color = Color.Black,
                center = Offset(x = currentX, y = currentY),
                radius = 10f
            )

            cordpair.xcord = currentX
            cordpair.ycord = currentY
            cordList = cordList + listOf(CordPair(cordpair.xcord,cordpair.ycord))
        }

        // Bottom Grid
        currentX = (canvasWidth - 890f)
        currentY = (canvasHeight - 350f)

        drawCircle(
            color = Color.Black,
            center = Offset(x = currentX, y = currentY),
            radius = 10f
        )
        cordpair.xcord = currentX
        cordpair.ycord = currentY
        cordList = cordList + listOf(CordPair(cordpair.xcord,cordpair.ycord))

        for (i in 1..8) {

            Log.d(" Bottom   x-Value ", "$currentX")
            Log.d(" Bottom   y-Value ", "$currentY")

            if (i % 3 == 0) {
                currentX -= 225f
                currentY += 100f
            }

            else {
                currentX += 175f
            }

            drawCircle(
                color = Color.Black,
                center = Offset(x = currentX, y = currentY),
                radius = 10f
            )

            cordpair.xcord = currentX
            cordpair.ycord = currentY
            cordList = cordList + listOf(CordPair(cordpair.xcord,cordpair.ycord))
        }

        var finalcordList = cordList.drop(1)

        Log.d("Tag", finalcordList.toString())
        Log.d("# of elements in cordpair",  finalcordList.size.toString())
        //Log.d("canvas width is: ", Canvas.getWidth().toString())

    }
}