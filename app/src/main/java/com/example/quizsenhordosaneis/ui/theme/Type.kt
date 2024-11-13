package com.example.quizsenhordosaneis.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.quizsenhordosaneis.R


val CustomFontFamily = FontFamily(
    Font(R.font.domine_regular, FontWeight.Normal),
    Font(R.font.domine_medium, FontWeight.Medium),
    Font(R.font.domine_semibold, FontWeight.SemiBold),
    Font(R.font.domine_bold, FontWeight.Bold),
)

// Set of Material typography styles to start with
val CustomTypography = Typography(
    bodyLarge = TextStyle(
        fontSize = 17.sp,
        fontFamily = FontFamily(Font(R.font.domine_bold)),
        fontWeight = FontWeight(700),
        color = Color(0xFF1B2821),
    ),
    headlineSmall = TextStyle(
        fontSize = 17.sp,
        fontFamily = FontFamily(Font(R.font.domine_regular)),
        fontWeight = FontWeight(700),
        color = Color(0xFF1B2821),
    ),
    headlineMedium = TextStyle(
        fontSize = 22.sp,
        lineHeight = 28.6.sp,
        fontFamily = FontFamily(Font(R.font.domine_bold)),
        fontWeight = FontWeight(700),
        color = Color(0xFF1B2821),
    ),
    headlineLarge = TextStyle(
        fontSize = 28.sp,
        fontFamily = FontFamily(Font(R.font.domine_regular)),
        fontWeight = FontWeight(400),
        color = Color(0xFF1B2821),
    ),
    titleLarge = TextStyle(
        fontSize = 32.sp,
        fontFamily = FontFamily(Font(R.font.domine_bold)),
        fontWeight = FontWeight(700),
        color = Color(0xFF1B2821),
    ),
)