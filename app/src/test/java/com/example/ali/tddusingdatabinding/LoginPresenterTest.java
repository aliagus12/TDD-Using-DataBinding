package com.example.ali.tddusingdatabinding;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

/**
 * Created by ali on 02/12/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    private LoginInterface view;
    private LoginPresenter presenter;
    private Property property;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        view = Mockito.mock(LoginInterface.class);
        presenter = new LoginPresenter(view);
        property = new Property("", "");
    }

    @Test
    public void shouldShowNoUserName() throws Exception {
        property.setUsername("");
        property.setPassword("hutapea");
        presenter.onLogin(property);
        verify(view).showErrorNoUsername();
    }

    @Test
    public void shouldShowNoPassword() throws Exception {
        property.setUsername("ali");
        property.setPassword("");
        presenter.onLogin(property);
        verify(view).showErrorNoPassword();
    }

    @Test
    public void shouldShowNoUsernamePassword() throws Exception {
        property.setUsername("");
        property.setPassword("");
        presenter.onLogin(property);
        verify(view).showErrorNoUsernamePassword();
    }

    @Test
    public void shouldShowWrongUsername() throws Exception {
        property.setUsername("agus");
        property.setPassword("hutapea");
        presenter.onLogin(property);
        verify(view).showWrongUsername();
    }

    @Test
    public void shouldShowWrongPassword() throws Exception {
        property.setUsername("ali");
        property.setPassword("sinaga");
        presenter.onLogin(property);
        verify(view).showWrongPassword();
    }

    @Test
    public void shouldShowSuccess() throws Exception {
        property.setUsername("ali");
        property.setPassword("hutapea");
        presenter.onLogin(property);
        verify(view).showSuccessLogin();
    }
}