import React, { Component } from 'react';

// Homepage
// Email: xxxxxxxx
// Password: xxxxxxxx
// Sign in button
// Doesn’t have an account? Sign up
// (...)

export default class HomePage extends Component {
    render() {
        return (
            <div>
                <h1> Here is the home page! </h1>
                {/* form 代表一个表单单元 */}
                <form class = "" action = "" method = "post">
                    <label for="">EMAIL: </label>
                    <input type="text" name="Email" value=""></input>
                    <br></br>
                    <label for="">PASSWORD: </label>
                    <input type="password" name="Password" value=""></input>
                    <br></br>
                    <button type = "submit">Submit</button>
                    <br />
                    <h2>Doesn't have an account?</h2>
                    <br></br>
                    <h2><a href="SignupForm.jsx">Sign up now!</a></h2>
                </form>


            </div>
        )
    }
}

{/* <form class="" action="" method="post" enctype="text/plain">

<label for="">Email: </label> <input type="text" name="Email" value=""></input>
<label for="">Password: </label> <input type="password" name="Password" value=""> </input>
<button type = "submit"></button>
</form> */}