package id.utdi.ruthnamecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Ruth Ito", "215410011"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    // Add padding around our message
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.profile_picture),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                // Set image size to 40 dp
                .size(40.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape)
        )
        //Fungsi `MessageCard` di atas merupakan bagian dari pengembangan antarmuka pengguna
        //menggunakan framework Kotlin-based Jetpack Compose. Dengan menggunakan anotasi `@Composable`,
        //fungsi ini mendefinisikan tampilan kartu pesan yang dapat diisi dengan data
        //dari objek `Message`. Kartu tersebut termasuk padding sekeliling pesan dan
        //sebuah gambar profil kontak yang dipasang dalam baris dengan modifikasi ukuran,
        //pemotongan bentuk lingkaran, dan menggunakan gambar sumber daya sebagai gambar profil.


        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = msg.author)
            // Add a vertical space between the author and message texts
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body)
        }
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Ruth Ito ","215410011")
        )
}
//Fungsi `PreviewMessageCard` di atas juga menggunakan anotasi `@Composable` dan `@Preview`,
//menunjukkan komponen `MessageCard` dalam mode preview. Dalam hal ini, fungsi ini membuat instance
//dari `MessageCard` dengan parameter pesan yang memuat nama "Ruth Ito" dan nomor "215410011".
//Ini memungkinkan pengembang untuk melihat tampilan kartu pesan secara langsung di editor atau
//lingkungan pengembangan sebelum diimplementasikan secara penuh, mempermudah proses desain dan debugging.
