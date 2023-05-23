import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css'
import './Login_Registration.css'
import { Link } from 'react-router-dom'
export default function Login() {
    return (
        <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 border shadow'>
            <div className='login'>
                <h2 className='mb-3'>Login Form</h2>
                <form className='needs-validation'>
                    <div className='form-group was-validated mb-2'>
                        <label htmlFor='email' className='form-label'>Email</label>
                        <input type='email' className='form-control' required></input>
                        <div className='invalid-feedback'>
                            Please Enter Your Email
                        </div>
                    </div>
                    <div className='form-group was-validated mb-2'>
                        <label htmlFor='password' className='form-label'>Password</label>
                        <input type='password'className='form-control'required></input>
                        <div className='invalid-feedback'>
                            Please Enter Your Password
                        </div>
                    </div>
                    <button className='btn btn-success block mt-2 mx-2' type='submit' >Sign In</button>
                    <Link className='btn btn-outline-dark mt-2 mx-2' to ='/registration'>Register Now</Link>
                </form>
            </div>
        </div>
    )
}
