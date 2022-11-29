import React, { Component } from 'react';


export default class MainPage extends Component {
    render() {
        return (
            <div>
                <h1> Here is the main page! </h1>
                <table cellspacing="40"> 
                    <tr>
                        <td>
                            <img src="profilephoto.JPG" alt="profile photo" height="300" width="220"></img>
                        </td>
                        <td>
                            <p> here is the username! </p>
                            <p> here is the introduction! <br></br>
                                <em>Mater of Engineering student at the <strong>University of Waterloo,</strong></em>
                                Actively searching for Software Development oppotunities!
                            </p>
                        </td>
                    </tr>
                </table>
            </div>
       
        )
    }
}