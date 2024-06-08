package com.example.myapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun DetailsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .background(Color(0xFF090011))
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 24.dp)
    ) {

        //Images val
        val bookmarkImage = painterResource(id = R.drawable.bookmark)
        val backArrowImage = painterResource(id = R.drawable.backarrow)
        val earthImage = painterResource(id = R.drawable.earth)
        val starImage = painterResource(id = R.drawable.star)
        val rainDrop = painterResource(id = R.drawable.raindrop)
        val tech = painterResource(id = R.drawable.tech)

        //banner Section
        Row(
            modifier
                .fillMaxWidth()
                .height(80.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            //Image
            Image(
                painter = backArrowImage,
                contentDescription = "Back Arrow",
                modifier = Modifier.size(50.dp)
            )
            //Text
            Text(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                text = "Back",
                color = Color.White
            )
            //Image
            Box(modifier = Modifier.width(252.dp)){
                Image(
                    painter = bookmarkImage,
                    contentDescription = "Bookmark",
                    modifier = Modifier
                        .size(50.dp)
                        .align(Alignment.BottomEnd)
                        .clip(RoundedCornerShape(25.dp))
                )
            }
        }
        //Planet Image Section
        Image(
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.CenterHorizontally),
            painter = earthImage,
            contentDescription = "Planet"
        )
        //Header Section
        Row (

        )
        {
            Column {
                Text(
                    fontSize = 14.sp,
                    text = "Planet",
                    color = Color.White
                )
                Text(
                    fontSize = 54.sp,
                    fontWeight = FontWeight.Bold,
                    text = "The Earth",
                    color = Color.White
                )
            }
            Column (
                Modifier.fillMaxWidth()
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    Spacer(
                        modifier = Modifier.width(62.dp)
                    )
                    Image(
                        modifier = Modifier.size(18.dp),
                        painter = starImage,
                        contentDescription = "Star"
                    )
                    Text(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        text = "4.8",
                        color = Color.White
                    )
                }
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 10.sp,
                    textAlign = TextAlign.Right,
                    text = "8 billion reviews",
                    color = Color.White
                )
            }
        }
        //Body Text Section
        Text(
            fontSize = 12.sp,
            lineHeight = 12.sp,
            text = "Nestled in the vastness of space, " +
                    "Earth is the third planet from the Sun and the only known celestial" +
                    " body to harbour life (so far). With its diverse ecosystems, " +
                    "ranging from lush forests to expansive deserts, and its vast oceans " +
                    "teeming with life, Earth is a vibrant oasis in the cosmos. Its atmosphere " +
                    "provides the perfect conditions for a rich tapestry of flora and fauna, making" +
                    " it a haven for countless species, including humans. From the highest peaks to" +
                    " the deepest ocean trenches, Earth's beauty and biodiversity inspire awe and " +
                    "reverence, earning it the nickname \"The Blue Jewel\" of the solar system.",
            color = Color.White
        )
        //Information Section
        Row (
            Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            //Content Block One
            Row (
                Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(color = Color(0xFF11083E))
                    .padding(15.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Column (
                    modifier = Modifier.width(110.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ){
                    Text(
                        fontSize = 32.sp,
                        text = "71%",
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        fontSize = 8.sp,
                        text = "H2O Surface Coverage",
                        color = Color.White
                    )
                }
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = rainDrop,
                    contentDescription = "Rain Drop"
                )
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Content Block two
            Row (
                Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(color = Color(0xFF11083E))
                    .padding(15.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Column (
                    modifier = Modifier.width(110.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ){
                    Text(
                        fontSize = 32.sp,
                        text = "42%",
                        color = Color.White
                    )
                    Text(
                        fontSize = 8.sp,
                        text = "Technology Advancement",
                        color = Color.White
                    )
                }
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = tech,
                    contentDescription = "tech"
                )
            }
        }
        //Additional Information Section

        Row (
            Modifier
                .clip(RoundedCornerShape(20.dp))
                .background(color = Color(0xFF11083E))
                .padding(15.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Column {
                Text(
                    text = "FACTS ABOUT EARTH",
                    color = Color.White
                )
                Text(
                    text = "3 videos available",
                    fontSize = 10.sp,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.width(60.dp))
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF7920C2))
            ) {
                Text(text = "Watch")
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DetailsScreenPreview() {
    MyApplicationTheme {
        DetailsScreen()
    }
}