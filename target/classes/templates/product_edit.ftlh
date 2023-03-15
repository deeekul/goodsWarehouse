<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>GoodsWarehouse</title>
    <link rel="stylesheet" href="/css/style.css">
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

    <h1 style="font-family: 'Segoe Print'; text-align: center"><i>Change good</i></h1>

    <form action="/products/${product.id}" method="post" enctype="multipart/form-data">
        <div style="margin-left: 30px"><i><b>Тип изделия: </b></i></div>
        <select name="type">
            <#list product_types as product_type>
                <option value="${product_type.id}">${product_type.name}</option>
            </#list>
        </select><br><br>

        <div style="margin-left: 30px"><i><b>Name: </b></i></div>
        <input type="text" name="title" value="${product.title}"/><br><br>

        <div style="margin-left: 30px"><i><b>Description: </b></i></div>
        <input type="text" name="description" value="${product.description}"/><br><br>

        <div style="margin-left: 30px"><i><b>Unit price: </b></i></div>
        <input type="number" name="unitPrice" value="${product.unitPrice}"/><br><br>

        <div style="margin-left: 30px"><i><b>Provider: </b></i></div>
        <select name="provider">
            <#list providers as provider>
                <option value="${provider.id}">${provider.name}</option>
            </#list>
        </select><br/><br/>
        <input type="submit" value="Update good"/>
    </form>
</body>
</html>