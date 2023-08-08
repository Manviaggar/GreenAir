package com.example.greenair

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenair.ui.theme.backgroundforregister

@Composable
fun LinkPage(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = backgroundforregister)) {
        HyperLinkText(fullText = "Explore our features on our official website", linkText = listOf("official website") , hyperlinks = listOf("https://backendgreenair.azurewebsites.net/"))
    }
}
@Composable
fun HyperLinkText(
    modifier: Modifier = Modifier,
    fullText: String,
    linkText:List<String>,
    LinkTextColor: Color = Color.Black,
    linkTextFontWeight: FontWeight = FontWeight.Medium,
    linkTextDecoration: TextDecoration = TextDecoration.Underline,
    hyperlinks:List<String>
){
    val annotatedString = buildAnnotatedString {
        append(fullText)
        linkText.forEachIndexed{index, link ->
            val startIndex=fullText.indexOf(link)
            val endIndex=startIndex+link.length
            addStyle(
                style= SpanStyle(
                    color = LinkTextColor,
                    fontSize = 50.sp,
                    fontWeight = linkTextFontWeight,
                    textDecoration = linkTextDecoration
                ),
                start = startIndex,
                end = endIndex
            )
            addStringAnnotation(
                tag = "URL",
                annotation = hyperlinks[index],
                start = startIndex,
                end = endIndex
            )

        }
        addStyle(
            style = SpanStyle(
                fontSize = 50.sp
            ),
            start = 0,
            end = fullText.length
        )
    }
    val uriHandler = LocalUriHandler.current
    ClickableText(
        modifier = modifier,
        text = annotatedString,
        onClick = {
            annotatedString
                .getStringAnnotations("URL", it, it)
                .firstOrNull()?.let { stringAnnotation ->
                    uriHandler.openUri(stringAnnotation.item)
                }
        }
    )
}