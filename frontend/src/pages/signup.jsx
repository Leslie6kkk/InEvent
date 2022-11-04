import React, { Component } from 'react';

// Signup page
// Email: xxxxxxxx
// Password: xxxxxxxx
// Sign up button

export default class SignUp extends Component {
    render() {
        return (
            <div>
                <h1>SignUP</h1>
                    {/* form 代表一个表单单元 */}
                <form class = "" action = "" method = "post">
                    <label for="">EMAIL: </label>
                    <input type="text" name="Email" value=""></input>
                    <br></br>
                    <label for="">Password: </label>
                    <input type="password" name="Password" value=""></input>
                    <br></br>
                    <button type = "submit">Sign Up</button>
                </form>
            </div>
        )
    }
}