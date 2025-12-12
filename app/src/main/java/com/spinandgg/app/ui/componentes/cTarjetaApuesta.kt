package com.spinandgg.app.ui.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun AgregarTarjetaApuesta(
    navController: NavHostController
) {/*
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .weight(0.8f)
            .background(Color(0xFF0D0335))
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(260.dp)
                .align(Alignment.TopCenter)
                .offset(y = 60.dp)
                .background(brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF2639C6),
                        Color.Black
                    )
                ),
                    shape = RoundedCornerShape(25.dp)
                )
                .border(
                    width = 2.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(25.dp)
                )
        ) {

            Text(
                text = "18:45",
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 5.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp, top = 30.dp, end = 10.dp, bottom = 10.dp)
                    .align(Alignment.Center)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.partido1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .matchParentSize()
                        .clip(RoundedCornerShape(16.dp))
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = { },
                        border = BorderStroke(2.dp, Color.Black),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black,

                            )
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) { Text(
                            text = "Real Madrid",
                            color = Color.Black
                        )


                            Text(
                                text = "1,7",
                                color = Color.Blue
                            )}
                    }
                    Button(
                        onClick = { },
                        border = BorderStroke(2.dp, Color.Black),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black,

                            )
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {Text(
                            text = "Empates",
                            color = Color.Black
                        )


                            Text(
                                text = "2,3",
                                color = Color.Blue
                            )}

                    }
                    Button(
                        onClick = { },
                        border = BorderStroke(2.dp, Color.Black),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black,

                            )
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "Alavés",
                                color = Color.Black
                            )

                            Text(
                                text = "2,5",
                                color = Color.Blue
                            )
                        }

                    }
                }
            }
        }
    }*/

}