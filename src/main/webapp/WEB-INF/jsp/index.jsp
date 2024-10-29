<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <style>
        .container {
            background-color: white;  /* White background */
            padding: 20px;            /* Some padding inside the container */
            max-width: 300px;         /* Set a maximum width */
            margin: 0 auto;           /* Center the container */
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1); /* Box shadow for depth */
            border-radius: 10px;      /* Optional: rounded corners */
        }

        /* Styling for the unordered list */
        .container ul {
            list-style-type: none;    /* Remove default bullet points */
            padding: 0;               /* Remove padding */
            margin: 0;                /* Remove margin */
        }

        /* Styling for list items */
        .container ul li {
            margin-bottom: 15px;      /* Space between the list items */
        }

        /* Styling for the links */
        .container ul li a {
            text-decoration: none;    /* Remove underline from links */
            color: #007BFF;           /* Blue link color */
            font-weight: bold;        /* Make the text bold */
            display: block;           /* Make links fill the list item */
            padding: 10px 15px;       /* Add some padding inside the links */
            border-radius: 5px;       /* Optional: rounded corners for links */
            transition: background-color 0.3s ease; /* Smooth hover effect */
        }

        /* Hover effect for links */
        .container ul li a:hover {
            background-color: #f0f0f0; /* Light grey background on hover */
            color: #0056b3;           /* Darker blue on hover */
        }

        </style>
    </head>

    <body>
    <div class="container">
        <ul>
        <li>
            <a href="movie">Go to the Movie Controller</a>
        </li>
            <li>
                <a href="book">Go to the Book Controller</a>
            </li>
            <li>
                <a href="cart">Go to the Cart Controller</a>
            </li>
            <li>
                <a href="utility">Go to the Utility Controller</a>
            </li>
        </ul>

    </div>

    </body>
</html>
