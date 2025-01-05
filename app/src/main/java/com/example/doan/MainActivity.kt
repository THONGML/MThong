package com.example.doan
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WineLoginScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WineLoginScreen() {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    WineCard(
                        country = "Ý",
                        name = "Vang F Gold Limited Edition",
                        price = "888.000 VNĐ",
                        volume = "Dung tích (750ml)",
                        year = "2005",
                        imageRes = R.drawable.ruou1,
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    WineCard(
                        country = "Ý",
                        name = "Vang Collefrisio Selezione",
                        price = "999.000 VNĐ",
                        volume = "Dung tích (750ml)",
                        year = "2020",
                        imageRes = R.drawable.ruou2,
                        modifier = Modifier.weight(1f)
                    )
                }
            }


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Trải nghiệm hoàn hảo",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF007F00)
                )
                Text(
                    text = "Chúng tôi mang đến cho bạn những chai rượu vang thượng hạng, bia và các loại đồ uống tinh tế từ khắp nơi trên thế giới. Cam kết mức giá tốt nhất kèm theo thông tin minh bạch, giúp bạn an tâm lựa chọn và thưởng thức.",
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }


            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = {  },
                        modifier = Modifier
                            .weight(1f)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF007F00))
                    ) {
                        Text(text = "Đăng nhập", color = Color.White)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Button(
                        onClick = {  },
                        modifier = Modifier
                            .weight(1f)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF007F00))
                    ) {
                        Text(text = "Đăng ký", color = Color.White)
                    }
                }
                TextButton(onClick = {  }) {
                    Text(text = "Tiếp tục với tài khoản khách", color = Color.Gray)
                }
            }
        }
    }
}

@Composable
fun WineCard(
    country: String,
    name: String,
    price: String,
    volume: String,
    year: String,
    imageRes: Int,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = modifier
            .fillMaxWidth()
            .height(150.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier.fillMaxHeight()
            ) {
                Text(text = "Quốc gia: $country", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                Text(text = name, fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Text(text = price, fontSize = 12.sp, color = Color.Red)
                Text(text = volume, fontSize = 12.sp, color = Color.Gray)
                Text(text = year, fontSize = 12.sp, color = Color.Gray)
            }
        }
    }
}
