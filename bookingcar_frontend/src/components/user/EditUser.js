import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { Link, useNavigate, useParams} from 'react-router-dom'

export default function EditUser() {
    let navigate = useNavigate()
    var {id} = useParams()
    const [user,setUser] = useState({
        fullname:"",
        phonenumber:"",
        email:"",
        password:"",
        address:"",
        role:""

    })
    const {fullname,phonenumber,email,password,address,role} = user
    const onInputChange =(e) =>{
        setUser({...user,[e.target.name]:e.target.value})
    }
    useEffect(()=>{
        loadUser()
    },[])
    
   const onSubmit = async(e) =>{
        e.preventDefault();
        await axios.put(`http://localhost:8080/manage_user/edit_user/${id}`,user)
        navigate("/manage_user/list_user")
   }

   const loadUser =async()=>{
        const result = await axios.get(`http://localhost:8080/manage_user/${id}`)
        setUser(result.data)
    }
    
  return (
    <div className='container'>
        <div className='row'>
            <div className='col-md-6 offset-md-3 border rounded p-4 mt-2 shadow'>
                <h2 className='text center'>Edit User</h2>
                <form className='needs-validation' onSubmit={(e)=>onSubmit(e)}>
                    <div className='form-group was-validated mb-1'>
                        <label htmlFor='fullname' className='form-label'>Full Name</label>
                        <input 
                            type='text' 
                            className='form-control'
                             name='fullname' 
                             value={fullname}
                             onChange={(e)=>onInputChange(e)}
                             required 
                        />
                        <div className='invalid-feedback'>
                            Please Enter Your Full Name
                        </div>
                    </div>
                    <div className='form-group was-validated mb-1'>
                        <label htmlFor='phonenumber' className='form-label'>Phone Number</label>
                        <input
                            type='tel' 
                            className='form-control' 
                            pattern='[0-9]{10}' 
                            name="phonenumber" 
                            value={phonenumber}
                            onChange={(e)=>onInputChange(e)}
                            required
                        />
                        <div className='invalid-feedback'>
                            Please Enter Your Phone Number
                        </div>
                    </div>
                    <div className='form-group was-validated mb-1'>
                        <label htmlFor='email' className='form-label'>Email</label>
                        <input
                            type='email'
                            className='form-control' 
                            name='email'
                            value={email}
                            onChange={(e)=>onInputChange(e)}
                            required
                        />
                        <div className='invalid-feedback'>
                            Please Enter Your Email
                        </div>
                    </div>

                    <div className='form-group was-validated mb-1'>
                        <label htmlFor='password' className='form-label'>Password</label>
                        <input
                            type='password' 
                            className='form-control' 
                            name='password'
                            value={password}
                            onChange={(e)=>onInputChange(e)}
                            required></input>
                        <div className='invalid-feedback'>
                            Please Enter Your Password
                        </div>
                    </div>
                    <div className='form-group was-validated mb-1'>
                        <label htmlFor='address' className='form-label'>Address</label>
                        <input
                            type='text' 
                            className='form-control' 
                            name='address'
                            value={address}
                            onChange={(e)=>onInputChange(e)}
                            required
                        />
                        <div className='invalid-feedback'>
                            Please Enter Your Address
                        </div>
                    </div>
                    <div className='form-group was-validated mb-1'>
                        <label htmlFor='role' className='form-label'>Role</label>
                        <input
                            type='text'
                            className='form-control'
                            name='role' 
                            value={role}
                            onChange={(e)=>onInputChange(e)}
                            required
                        />

                        <div className='invalid-feedback'>
                            Please Enter Your Role
                        </div>
                    </div>
                    <button className='btn btn-success block mt-1 mx-2' type='submit' >Save Your Edit</button>
                    <Link className='btn btn-dark block mt-1 mx-2' type='submit' to="/manage_user/list_user" >Back</Link>
                </form>
            </div>
            
        </div>
    </div>
  )
}
