package be.bepolytech.bepos

import android.R.attr.maxLines
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.AddShoppingCart
import androidx.compose.material.icons.filled.Backspace
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Inventory
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.ReceiptLong
import androidx.compose.material.icons.filled.RemoveCircle
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import be.bepolytech.bepos.ui.theme.BEPOSTheme


//
// ---------- USE THIS ------------
// https://developer.android.com/jetpack/compose/lists#large-datasets
// --------------------------------
//

class VenteActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BEPOSTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BEPOSScaffoldVente()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BEPOSScaffoldVente(modifier: Modifier = Modifier) {

    //val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        //modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                    actionIconContentColor = MaterialTheme.colorScheme.secondary,
                    navigationIconContentColor = MaterialTheme.colorScheme.secondary,
                ),
                title = {
                    //Text("Top app bar")
                    Text(
                        text = stringResource(id = R.string.app_name), // TODO: do this with other strings
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                actions = {
                    //IconButton(onClick = { /* TODO: do something */ }) {
                    //    Icon(
                    //        imageVector = Icons.Filled.Home,
                    //        contentDescription = stringResource(id = R.string.home),
                    //        // TODO: if current screen is home, tint icon
                    //        tint = if (true) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary
                    //    )
                    //    //Text(
                    //    //    text = "Home",
                    //    //    maxLines = 1
                    //    //)
                    //}
                    //IconButton(onClick = { /* TODO: do something */}) {
                    //    //Icon(
                    //    //    imageVector = Icons.Filled.List,
                    //    //    contentDescription = "Inventory"
                    //    //)
                    //    Text(
                    //        text = stringResource(id = R.string.inventory),
                    //        maxLines = 1
                    //    )
                    //}
                    //IconButton(onClick = { /* TODO: do something*/ }) {
                    //    //Icon(
                    //    //    imageVector = Icons.Filled.List,
                    //    //    contentDescription = "Transactions"
                    //    //)
                    //    Text(
                    //        text = stringResource(id = R.string.transactions),
                    //        maxLines = 1,
                    //        // TODO: if current screen is transactions, tint text and underline
                    //        fontWeight = if (true) FontWeight.Bold else FontWeight.Normal,
                    //        textDecoration = if (true) TextDecoration.Underline else TextDecoration.None
                    //    )
                    //}
                    //IconButton(onClick = { /* TODO: do something*/ }) {
                    //    //Icon(
                    //    //    imageVector = Icons.Filled.List,
                    //    //    contentDescription = "Restock"
                    //    //)
                    //    Text(
                    //        text = stringResource(id = R.string.restock),
                    //        maxLines = 1
                    //    )
                    //}

                    NavigationBarItem(
                        selected = true,
                        //selected = currentRoute == restockRoute
                        onClick = { /*TODO*/ },
                        icon = {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                content = {
                                    Icon(
                                        imageVector = Icons.Filled.Home,
                                        contentDescription = stringResource(id = R.string.home)
                                    )
                                    Text(
                                        textAlign = TextAlign.Center,
                                        text = stringResource(id = R.string.home),
                                        maxLines = 1,
                                    )
                                },
                            )
                        },
                    )
                    NavigationBarItem(
                        selected = true,
                        //selected = currentRoute == restockRoute
                        onClick = {
                                  /*TODO*/
                                  // navigate to this screen
                            },
                        icon = {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                content = {
                                    Icon(
                                        imageVector = Icons.Filled.Inventory,
                                        contentDescription = stringResource(id = R.string.inventory)
                                    )
                                    Text(
                                        textAlign = TextAlign.Center,
                                        text = stringResource(id = R.string.stock),
                                        maxLines = 1,
                                    )
                                },
                            )
                        },
                        //label = { Text(text = stringResource(id = R.string.inventory), maxLines = 1)}
                    )
                    NavigationBarItem(
                        selected = true,
                        //selected = currentRoute == transactionsRoute
                        onClick = { /*TODO*/ },
                        icon = {
                            Icon(
                                imageVector = Icons.Filled.ReceiptLong,
                                contentDescription = stringResource(id = R.string.transactions)
                            )
                        },
                        //label = { Text(text = stringResource(id = R.string.transactions), maxLines = 1)}
                    )
                    NavigationBarItem(
                        selected = true,
                        //selected = currentRoute == restockRoute
                        onClick = { /*TODO*/ },
                        icon = {
                            Icon(
                                imageVector = Icons.Filled.AddShoppingCart,
                                contentDescription = stringResource(id = R.string.restock)
                            )
                        },
                        //label = { Text(text = stringResource(id = R.string.restock), maxLines = 1)}
                    )
                    NavigationBarItem(
                        selected = true,
                        //selected = currentRoute == restockRoute
                        onClick = { /*TODO*/ },
                        icon = {
                            Icon(
                                imageVector = Icons.Filled.Settings,
                                contentDescription = stringResource(id = R.string.settings)
                            )
                        },
                        //label = { Text(text = stringResource(id = R.string.restock), maxLines = 1)}
                    )

                    /*
                    IconButton(onClick = { /* TODO: do something */ }) {
                        Icon(
                            imageVector = Icons.Filled.Settings,
                            contentDescription = stringResource(id = R.string.settings)
                        )
                    }
                    */
                }
            )
        }
    ) { innerPadding ->
        Row(
            modifier = Modifier
                .fillMaxWidth()
        )
        {
            LazyColumn(
                // Column-list of items
                contentPadding = PaddingValues(horizontal = 4.dp, vertical = 4.dp),
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxWidth()
                    .weight(1f),
                content = {
                    // Inventory for sale

                    //items(
                    //     items = transactions,
                    //     key = { item -> item.date }
                    // ) { item ->
                    item(
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                modifier = Modifier
                                    .weight(4f)
                                    .padding(horizontal = 8.dp),
                                text = "Article",
                            )
                            Text(
                                modifier = Modifier
                                    .weight(1.4f)
                                    .padding(horizontal = 8.dp),
                                text = "Stock",
                            )
                            Text(
                                modifier = Modifier
                                    .weight(1.4f)
                                    .padding(horizontal = 8.dp),
                                text = "Prix",
                            )
                        }
                    }
                    items(20) { item ->
                        Card(
                            enabled = true,//item.quantity > 0,
                            modifier = Modifier
                                .padding(bottom = 4.dp, start = 4.dp, end = 4.dp)
                                .fillMaxWidth(),
                            onClick = {
                                /* TODO: do something */
                                // this item open info in inventory screen
                            }
                        ) { // make elements inline
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .height(52.dp)
                                    .padding(4.dp)
                                    .fillMaxWidth(),
                            ) {
                                Icon(
                                    /* TODO: change with a picture of the product ? */
                                    imageVector = Icons.Filled.PlayArrow,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(start = 4.dp),
                                )
                                Text(
                                    modifier = Modifier
                                        .weight(3f)
                                        .fillMaxWidth()
                                        .padding(8.dp),
                                    text = "Item $item",
                                )
                                Text(
                                    modifier = Modifier
                                        .weight(0.5f)
                                        .padding(8.dp),
                                    text = "1",
                                    /* TODO: Text in red if stock is low or 0 */
                                )
                                Text(
                                    modifier = Modifier
                                        .weight(1.4f)
                                        .fillMaxWidth()
                                        .padding(8.dp),
                                    textAlign = TextAlign.End,
                                    text = "$item.00 €",
                                )
                            }
                        }
                    }
                    // Last item of LazyColumn
                    item {
                        Text(
                            modifier = Modifier.padding(8.dp),
                            textAlign = TextAlign.Center,
                            text = stringResource(id = R.string.last_list_item),
                        )
                    }
                }
            )
            // Cart
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxWidth()
                    .weight(1.3f),
            ) {
                Card(
                    modifier = Modifier
                        .padding(4.dp)
                        .fillMaxWidth(),
                    onClick = {/* do nothing */}
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(12.dp),
                            text = stringResource(id = R.string.shopping_cart),
                            fontSize = 24.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    LazyColumn(
                        // Column-list of items in cart
                        //contentPadding = PaddingValues(horizontal = 4.dp, vertical = 4.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ) {
                        // Inventory for sale
                        items(10) { cartItem ->
                            Card(
                                enabled = true,//item.quantity > 0,
                                modifier = Modifier
                                    .padding(4.dp)
                                    .fillMaxWidth(),
                                onClick = {
                                    /* TODO SOMETHING */
                                }
                            ) { // make elements inline
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        modifier = Modifier
                                            .weight(2f)
                                            .padding(8.dp),
                                        text = "Article $cartItem",
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.AddCircle,
                                        contentDescription = "add one of this item",
                                        modifier = Modifier
                                            .weight(1f)
                                            .size(52.dp)
                                            .padding(horizontal = 8.dp, vertical = 4.dp),
                                    )
                                    Text(
                                        modifier = Modifier
                                            .weight(0.5f)
                                            .fillMaxWidth(),
                                            //.padding(8.dp),
                                        // quantity and unit price
                                        text = "$cartItem x",
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center,
                                        maxLines = 1,
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.RemoveCircle,
                                        contentDescription = "remove one of this item",
                                        modifier = Modifier
                                            .weight(1f)
                                            .size(52.dp)
                                            .padding(horizontal = 8.dp, vertical = 4.dp),
                                    )
                                    Text(
                                        modifier = Modifier
                                            .weight(2f)
                                            .fillMaxWidth()
                                            .padding(8.dp),
                                        // quantity and unit price
                                        text = "$cartItem.00 €",
                                        textAlign = TextAlign.End,
                                    )
                                }
                            }
                            Divider(
                                modifier = Modifier.padding(horizontal = 8.dp),
                                thickness = 1.dp,
                            )
                        }
                        // test montant custom
                        item {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    modifier = Modifier
                                        .weight(2f)
                                        .padding(8.dp),
                                    text = "[Montant Custom]",
                                )
                                Text(
                                    modifier = Modifier
                                        .weight(2f)
                                        .fillMaxWidth()
                                        .padding(8.dp),
                                    // quantity and unit price
                                    text = "12.80 €",
                                    textAlign = TextAlign.End,
                                )
                            }
                            Divider(
                                modifier = Modifier.padding(horizontal = 8.dp),
                                thickness = 1.dp,
                            )
                        }
                        // Last item of LazyColumn
                        item {
                            Text(
                                modifier = Modifier.padding(8.dp),
                                textAlign = TextAlign.Center,
                                text = stringResource(id = R.string.last_list_item),
                            )
                        }
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {Text(
                            modifier = Modifier
                                .weight(0.8f)
                                .padding(start = 4.dp),
                            textAlign = TextAlign.End,
                            text = "Total: ",
                            fontSize = 20.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                        OutlinedButton(
                            modifier = Modifier
                                .weight(2f)
                                .padding(8.dp),
                            onClick = { /* do nothing */ }
                        ) {
                            Text(
                                text = "24.50 €",
                                fontSize = 32.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        Button(
                            modifier = Modifier
                                .weight(1.6f)
                                .padding(8.dp),
                            onClick = {
                                /*TODO*/
                                // pay amount
                            }
                        ) {
                            Text(
                                text = "Payer",
                                fontSize = 32.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                }
            }
                // Price and Numpad
                Column(
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxWidth()
                        .weight(1.3f),
                ) {
                    Card(
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth(),
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            FilledTonalButton(
                                modifier = Modifier
                                    .padding(8.dp)
                                    .weight(2f)
                                    .size(80.dp),
                                onClick = { /* do nothing */ }
                            ) {
                                Text(
                                    modifier = Modifier.weight(1f),
                                    text = "€",
                                    textAlign = TextAlign.Start,
                                    fontSize = 20.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Text(
                                    modifier = Modifier
                                        .padding(end = 8.dp)
                                        .weight(1f),
                                    text = "0.00",
                                    textAlign = TextAlign.End,
                                    fontSize = 28.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                ) //$totalPrice
                            }
                            ElevatedButton(
                                modifier = Modifier
                                    .padding(8.dp)
                                    .weight(1f)
                                    .size(80.dp),
                                onClick = { /*TODO*/ }
                            ) {
                                Text(
                                    text = "Add",
                                    fontSize = 28.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        }
                        Divider(
                            thickness = 1.dp,
                            modifier = Modifier.padding(top = 8.dp)
                        )
                        LazyVerticalGrid(
                            columns = GridCells.Fixed(3),
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(12.dp),
                        ) {
                            items(9) { number ->

                                Button(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        //.fillMaxWidth()
                                        .size(100.dp),
                                    shape = CircleShape,
                                    contentPadding = PaddingValues(0.dp),
                                    onClick = {
                                        /*TODO*/
                                        // totalPrice.append($number)
                                    }
                                ) {
                                    val text = 9 - number
                                    Text(
                                        text = text.toString(),
                                        fontSize = 40.sp,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                }
                            }
                            item() {
                                OutlinedButton(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        //.fillMaxWidth()
                                        .size(100.dp),
                                    contentPadding = PaddingValues(0.dp),
                                    onClick = {
                                        /*TODO*/
                                        // customPriceInt = 0
                                    }
                                ) {
                                    /*Icon(
                                        imageVector = Icons.Filled.Add,
                                        contentDescription = "Clear",
                                        modifier = Modifier.size(60.dp),
                                    )*/
                                    Text(
                                        text = "C",
                                        fontSize = 40.sp,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                }
                            }
                            item() {
                                Button(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        //.fillMaxWidth()
                                        .size(100.dp),
                                    contentPadding = PaddingValues(0.dp),
                                    onClick = {
                                        /*TODO*/
                                        // totalPrice.append($number)
                                    }
                                ) {
                                    Text(
                                        text = "0",
                                        fontSize = 40.sp,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                }
                            }
                            item() {
                                OutlinedButton(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        //.fillMaxWidth(),
                                        .size(100.dp),
                                    contentPadding = PaddingValues(0.dp),
                                    onClick = {
                                        /*TODO*/
                                        // totalPrice.pop(-1) //?
                                    }
                                ) {
                                    Icon(
                                        imageVector = Icons.Filled.Backspace,
                                        contentDescription = "Backspace",
                                        modifier = Modifier.size(46.dp),
                                    )
                                }
                            }

                        }
                    }

            }
            /*
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text =
                """
                    This is an example of a scaffold. It uses the Scaffold composable's parameters to create a screen with a simple top app bar, bottom app bar, and floating action button.

                    It also contains some basic inner content, such as this text.
                """.trimIndent(),
            )
        }
        */
        }
    }
}

@Preview(
    showBackground = true,
    device = "spec:parent=Lenovo Tab M9,orientation=landscape",
    wallpaper = Wallpapers.BLUE_DOMINATED_EXAMPLE, locale = "fr-rBE", // fr-rBE ? fr-BE ?
    name = "Lenovo Tab M9 Landscape"
)
@Composable
fun VentePreview() {
    BEPOSTheme {
        BEPOSScaffoldVente()
    }
}