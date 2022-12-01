import React, { Component } from 'react';
import axios from 'axios';

export default class SignUpForm extends Component {
    constructor() {
        super();
        this.state = {
            email:"",
            password:""
        }
    }

    // var data = JSON.stringify({
    //     username: this.state.emial,
    //     password: this.state.password
    // });
    /**In the form, when you click on the event to submit,
     *  execute the onsubmit event first */
    onSubmit = async (events) => {
        /**Prevent default jumpping */
        events.preventDefault();
        console.log(this.state);
        await axios.post("http://localhost:8080/user/signup", this.state)
    }

    HandleChange = (events) => {
        this.setState({
            [events.target.name]:events.target.value
            // password:events.target.value
        })
    };
    
    render() {
        // const {email, password} = this.state;
        return (
            <div>
                <form onSubmit={this.onSubmit}>
                    <h1>Create an Account Now</h1>
                    <div className='form-group'>
                        <label className='control-label'>E-mail</label>
                        <input 
                            className='form-control'
                            type='text'
                            name='email'
                            value={this.state.email}
                            onChange={this.HandleChange}
                        />
                        <label className='control-label'>Password</label>
                        <input 
                            className='form-control'
                            type='password'
                            name='password'
                            value={this.state.password}
                            onChange={this.HandleChange}
                        />
                    </div>
                    <div className='form-group'>
                        <button className='btn btn-primary btn-lg'>Sign Up</button>
                    </div>
                </form>
                
            </div>
        )
    }
}