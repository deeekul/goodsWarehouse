<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/css/style.css">

    <title>GoodsWarehouse</title>
</head>
<body>

    <#--Header-->
    <nav class="nav">
        <a href="/" class="logo_text">GoodsWarehouse</a>
        <div class="right_nav">
            <ul class="mnu_top">
                <li><a href="/products" class="down">Goods</a>
                    <ul class="mnu_sub">
                        <li><a href="/products/new">New good</a></li>
                    </ul>
                </li>
                <li><a href="/productTypes">Goods types</a></li>
                <li><a href="/providers" class="down">Providers</a>
                    <ul class="mnu_sub">
                        <li><a href="/providers/new">New provider</a></li>
                    </ul>
                </li>
                <li><a href="/invoices">Invoices</a></li>
                <li><a href="/productsLists" class="down">Orders</a>
                    <ul class="mnu_sub">
                        <li><a href="/productsLists/new">New order</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>

    <h1 style="font-family: 'Segoe Print'; text-align: center"><i>Detailed information about order</i></h1>

    <b style="margin-left: 30px; font-size: 18px"><i>Good: </i></b>${productsList.getProduct().getTitle()}<br><br>
    <b style="margin-left: 30px; font-size: 18px"><i>Invoice: </i></b>${productsList.getInvoice().getNumber()}<br><br>
    <b style="margin-left: 30px; font-size: 18px"><i>Quantity: </i></b>${productsList.getQuantity()}<br><br>
    <b style="margin-left: 30px; font-size: 18px"><i>Unit price: </i></b>${productsList.getPrice()} руб.<br><br><br><br>

    <div style="text-align: center">
        <a class="a_1" href="/productsLists/${productsList.id}/edit" >Change order</a>
    </div><p/>

    <form action="/productsLists/delete/${productsList.id}" method="post">
        <input type="submit" value="Delete order"/>
    </form>
</body>
</html>